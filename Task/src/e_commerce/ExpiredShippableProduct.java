package e_commerce;

import java.time.LocalDate;

public class ExpiredShippableProduct extends ExpiredProduct implements Shippable {
	    float weight;

	    public ExpiredShippableProduct(String name, float price, int quantity, LocalDate expiryDate, float weight) {
	        super(name, price, quantity, expiryDate);
	        this.weight = weight;
	    }

	    @Override
	    public float getWeight() {
	        return weight;
	    }
}