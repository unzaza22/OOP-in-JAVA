package ApisitVendingMachine;

public class Drink extends Product {
	public Drink(int ID, String name, int quantity, int price) {
		super(ID, name, quantity, price);
	}

	@Override
	public void cosume() {
		System.out.println("Drinking: " + getName());
	}
}
