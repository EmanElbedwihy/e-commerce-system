package e_commerce;

import java.util.ArrayList;

public class Customer {
	String name;
    float balance;
    Cart cart = new Cart();
    
    public Customer(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        float subtotal = cart.getSubTotal();
        float shipping=0;
        
        ArrayList<CartItem> shippableItems = cart.getShippableItems();
        if (!shippableItems.isEmpty()) {
        	shipping=ShippingService.sendItems(shippableItems);
        }
        float total = subtotal + shipping;

        if (total > balance) {
            System.out.println("Balance is not Enough to Checkout.");
            return;
        }

        balance -= total;
        
        if (!shippableItems.isEmpty()) {
        	ShippingService.printItems(shippableItems);
        }
        
        System.out.println();
        System.out.println("** Checkout receipt ** ");
        
        cart.printItems();
        System.out.println("---------------------------------------");

        System.out.println("Subtotal" +"         "+subtotal);
        System.out.println("Shipping" +"         "+shipping);
        System.out.println("Amount"+"           "+total);
        
        cart.items.clear();
       

        
    }

}
