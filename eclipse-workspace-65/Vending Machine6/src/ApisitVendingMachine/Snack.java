package ApisitVendingMachine;

public class Snack extends Product {
	public Snack(int ID, String name, int quantity, int price) {
		super(ID, name, quantity, price);
	}
	
	@Override
	public void cosume() {
		System.out.println("Snacking: " + getName());
	}
}
