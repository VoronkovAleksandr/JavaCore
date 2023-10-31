package HomeWork004_task2;

public class NoProductException extends Exception {
    public NoProductException(String productName) {
        super(productName);
    }
}
