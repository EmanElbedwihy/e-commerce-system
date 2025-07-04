package e_commerce;

public abstract class Product {
	String name;
	float price;
	int quantity;
	
	public Product(String name,float price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

    public boolean isAvailable(int orderdQuantity) {
        return this.quantity >= orderdQuantity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }
    
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    public abstract boolean isExpired();

    public String getName() { return this.name; }
    
    public float getPrice() { return this.price; }


	

}
