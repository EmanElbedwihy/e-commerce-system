package e_commerce;

import java.time.LocalDate;

public class e_commerce {
	

	    public static void main(String[] args) {
	        
	        Customer customer1 = new Customer("Eman", 1000);//balance=1000
	        Customer customer2 = new Customer("Ahmed", 100);//balance=100
	        Customer customer3 = new Customer("Sara", 1000);//balance=1000
	        Customer customer4 = new Customer("Sara", 1000);//balance=1000



	        

	        // Create products
	        Product cheese = new ExpiredShippableProduct("Cheese", 50, 3, LocalDate.of(2025, 8, 1), (float)0.5);
	        Product tv = new NonExpiredShippableProduct("TV", 5000, 1, (float)10);
	        Product scratchCard = new NonExpiredProduct("Mobile Scratch Card", 20, 10);
	        Product biscuits = new ExpiredProduct("Biscuits", 20, 5, LocalDate.of(2024, 7, 1)); // already expired


	        
	        System.out.println("Test Case 1");
	        System.out.println();
	        customer1.cart.addProduct(cheese, 2);         
	        customer1.cart.addProduct(scratchCard, 2);    
	        customer1.checkout();
	        System.out.println();

	     
	        System.out.println("Test Case 2"); 
	        System.out.println();
	        customer2.cart.addProduct(tv, 1);         
	        customer2.checkout();
	        System.out.println();

	        
	        System.out.println("Test Case 3");
	        System.out.println();
	        customer3.cart.addProduct(cheese, 2);
	        System.out.println();

	        
	        System.out.println("Test Case 4");
	        System.out.println();
	        customer4.cart.addProduct(biscuits, 1);         
	        

	        
	        
	    }
	}


	


