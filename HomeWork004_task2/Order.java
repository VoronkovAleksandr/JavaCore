package HomeWork004_task2;

public class Order {
    private Buyer buyer;
    private Product product;
    private Integer quantity;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  "Заказ покупателя: " + buyer.getNickName() + "\n" +
                product.getProductName() +
                "в количестве: " + quantity + " шт.";
    }
}
