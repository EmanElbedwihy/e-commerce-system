package e_commerce;

import java.time.LocalDate;

public class ExpiredProduct extends Product {

	protected LocalDate expiryDate;

    public ExpiredProduct(String name, float price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

}
