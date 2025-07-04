package e_commerce;

public class NonExpiredProduct extends Product {

    public NonExpiredProduct(String name, float price, int quantity) {
        super(name, price, quantity);

    }

    @Override
    public boolean isExpired() {
        return false;
    }

}
