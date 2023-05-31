package ApisitVendingMachine;

abstract class Product extends VendingMachine {
	private int ID;
	private String name;
	private int quantity;
	private int price;
	
	public Product(int ID, String name, int quantity, int price) {
		this.ID = ID;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public abstract void cosume();
	
	public int getID() { return this.ID; }
	
	public String getName() { return this.name; }
	
	public int getQuantity() { return this.quantity; }
	
	public int getPrice() { return this.price; }
	
	public void setID(int ID) { this.ID = ID; }
	
	public void setName(String name) { this.name = name; }
	
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	public void setPrice(int price) { this.price = price; }
	
}
