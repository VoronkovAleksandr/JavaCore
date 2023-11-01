package HomeWork004_task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Buyer> buyers;
    static List<Product> products;
    static List<Order> orders;

    public static void main(String[] args) {

        buyers = new ArrayList();
        products = new ArrayList();
        orders = new ArrayList();

        fillShop(buyers, products);

        startShopping();

        System.out.printf("Всего совершено покупок: %s", orders.size());
    }

    private static void startShopping() {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;

        while (start) {


            System.out.println("Введите ник покупателя:");
            String nickName = scanner.nextLine();
            System.out.println("Введите наименование товара:");
            String productName = scanner.nextLine();
            System.out.println("Введите количество товара:");
            String quantity = scanner.nextLine();
            try {
                makePurchase(nickName, productName, quantity);
            } catch (NoProductException e) {
                System.out.println("Такого продукта нет, повторите ввод");
                ;
            } catch (NoBuyerException e) {
                System.out.println("Такого покупателя нет, повторите ввод");
                ;
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Чтобы завершить покупки введите 0, чтобы продолжить покупки нажмите ENTER");
            if (scanner.nextLine().equals("0")) start = false;
        }
    }

    private static void makePurchase(String buyer, String product, String quantity) throws NoProductException, NoBuyerException, NegativeNumberException {
        Product setProduct = null;
        Buyer buyer_ = getBuyer(buyer);
        Product product_ = getProduct(product);
        Integer quantity_ = getInteger(quantity);
        if (buyer_ == null) throw new NoBuyerException(buyer);
        if (product_ == null) throw new NoProductException(product);
        if (quantity_ == null) throw new NegativeNumberException("Вы ввели 0 или отрицательное число");

        orders.add(new Order(buyer_, product_, quantity_));
    }

    private static Integer getInteger(String number) throws NegativeNumberException {
        try {
            Integer num = Integer.parseInt(number);
            if (num > 0) return num;
        } catch (NumberFormatException e){
            throw new NegativeNumberException("Вы ввели символ вместо числа");
        }
        return null;
    }

    private static Product getProduct(String product) {
        for (Product item : products
        ) {
            if (item.getProductName().equals(product)) return item;
        }
        return null;
    }


    private static Buyer getBuyer(String nickName) {
        for (Buyer item : buyers
        ) {
            if (item.getNickName().equals(nickName)) return item;
        }
        return null;
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
