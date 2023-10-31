package HomeWork004_task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Buyer> buyers = new ArrayList();
        List<Product> products = new ArrayList();
        List<Order> orders = new ArrayList();

        fillShop(buyers, products);

        startShopping(buyers, products, orders);
        System.out.printf("Всего совершено %s покупок", orders.size());
    }

    private static void startShopping(List<Buyer> buyers, List<Product> products, List<Order> orders) throws NoBuyerException, NoProductException {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;

        while (start) {
            Buyer buyer = null;
            Product product = null;

            System.out.println("Введите ник покупателя:");
            String nickName = scanner.nextLine();

            for (Buyer item: buyers
                 ) {
                if (item.getNickName().equals(nickName)) {
                    buyer = item;
                    break;
                }
            }
            if (buyer == null) throw new NoBuyerException(nickName);

            System.out.println("Введите наименование товара:");
            String productName = scanner.nextLine();
            for (Product item: products
                 ) {
                if (item.getProductName().equals(productName)){
                    product = item;
                    break;
                }
            }
            if (product == null) throw new NoProductException(productName);


            System.out.println("Введите количество товара:");
            String quantity = scanner.nextLine();


            System.out.println("Чтобы завершить покупки введите 0");
            if (scanner.nextLine().equals("0")) start = false;
        }
    }

    private static void makePurchase(String buyer, String product, String quantity) {

    }

    private static void fillShop(List<Buyer> buyers, List<Product> products) {
        buyers.add(new Buyer("Иван"));
        buyers.add(new Buyer("Степан"));
        buyers.add(new Buyer("Петрович"));
        buyers.add(new Buyer("Ирина"));

        products.add(new Product("Кофеварка"));
        products.add(new Product("Микроволновая печь"));
        products.add(new Product("Духовой шкаф"));
        products.add(new Product("Соковыжималка"));
    }
}
