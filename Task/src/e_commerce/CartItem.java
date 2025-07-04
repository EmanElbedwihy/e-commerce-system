package e_commerce;

public class CartItem {
	
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public boolean isShippable() {
        return product instanceof Shippable;
    }
    
    public Product getProduct() {
        return product;
    }


}
