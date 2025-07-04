package e_commerce;

import java.util.ArrayList;

public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (!product.isAvailable(quantity)) {
            System.out.println("Product is Out of Stock.");
            return;
        }
        else if (product.isExpired()) {
            System.out.println("Product is Expired.");
            return;
        }
        items.add(new CartItem(product, quantity));
        product.decreaseQuantity(quantity);
    }
    

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public float getSubTotal() {
        float subTotal = 0;
        for (CartItem item : items) {
        	subTotal += item.getTotalPrice();
        }
        return subTotal;
    }


    public ArrayList<CartItem> getShippableItems() {
        ArrayList<CartItem> shippableItems = new ArrayList<>();
        for (CartItem item : items) {
            if (item.isShippable()) {
            	shippableItems.add(item);
            }
        }
        return shippableItems;
    }
    
    public void printItems() {
        for (CartItem item : items) {
            System.out.println((int)item.getQuantity()+"x "+item.getProduct().getName()+"      "+item.getTotalPrice());
        }
    }
}
