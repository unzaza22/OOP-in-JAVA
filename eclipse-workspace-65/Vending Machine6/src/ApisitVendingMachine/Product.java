package ApisitVendingMachine;

abstract class Product {
	private int ID;
	private String name;
	private int quantity;
	private int price;
	private boolean isOnPromotion;
	private double discountRate;
	private boolean isPromo;
	
	public Product() {
		
	}
	
	public Product(int ID, String name, int quantity, int price) {
		this.ID = ID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.isPromo = false;
	}
	
	public Product(int ID, boolean isPromo) {
		this.ID = ID;
		this.isPromo = false;
	}
	
	public abstract void cosume();
	
	public int getID() { return this.ID; }
	
	public String getName() { return this.name; }
	
	public int getQuantity() { return this.quantity; }
	
	public int getPrice() {
		if (isOnPromotion) {
			return (int) (price * (1 - discountRate));
		} else {
			return price;
		}
	}
	
	public void setID(int ID) { this.ID = ID; }
	
	public void setName(String name) { this.name = name; }
	
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	public void setPrice(int price) { this.price = price; }
	
	public void setPromotion(boolean isOnPromotion, double discountRate) {
		this.isOnPromotion = isOnPromotion;
		this.discountRate = discountRate;
	}
	
	public void setPromo(Integer ID, boolean isPromo) { 
		this.ID = ID;
		this.isPromo = isPromo; 
		}
	
	public boolean getPromo(int ID) { return this.isPromo; }
	
}
