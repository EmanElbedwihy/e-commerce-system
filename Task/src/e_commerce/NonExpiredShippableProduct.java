package e_commerce;


public class NonExpiredShippableProduct extends NonExpiredProduct implements Shippable {
	    float weight;

	    public NonExpiredShippableProduct(String name, float price, int quantity,float weight) {
	        super(name, price, quantity);
	        this.weight = weight;
	    }

	    @Override
	    public float getWeight() {
	        return weight;
	    }
}