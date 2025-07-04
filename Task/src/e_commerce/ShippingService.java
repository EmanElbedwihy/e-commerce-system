package e_commerce;

import java.util.List;

public class ShippingService {

    public static float sendItems(List<CartItem> items) {
    	float weight=0;
        for (CartItem item : items) {
        	Shippable shippleableItem=(Shippable)item.getProduct();
        	weight+=item.getQuantity()*shippleableItem.getWeight();
        }
        return weight*10;
    }
    
    public static void printItems(List<CartItem> items) {
    	System.out.println("** Shipment notice **");
    	float weight=0;
        for (CartItem item : items) {
        	Shippable shippleableItem=(Shippable)item.getProduct();
        	weight+=item.getQuantity()*shippleableItem.getWeight();
            System.out.println((int)item.getQuantity()+"x "+shippleableItem.getName() + "            " + item.getQuantity()*shippleableItem.getWeight()+"Kg");
        }
        System.out.println("Total package weight "+weight+"Kg");
    }
}
