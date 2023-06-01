package Coin;

import ApisitVendingMachine.VendingMachine;

public class Coin {
	private int value;
	private int quantity;
	
	public Coin(int value, int quantity) {
		this.value = value;
		this.quantity = quantity;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void increaseQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void decreaseQuantity() {
		if(this.quantity > 0) {
			this.quantity--;
		}
	}
	
}
