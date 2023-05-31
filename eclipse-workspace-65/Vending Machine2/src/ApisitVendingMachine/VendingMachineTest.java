package ApisitVendingMachine;

import Cash.CashPayment;

public class VendingMachineTest {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.addProduct(new Drink(1, "Water", 30, 15));
		vendingMachine.addProduct(new Drink(2, "Cocacola", 20, 20));
		vendingMachine.addProduct(new Drink(3, "Cocacola 1L", 10, 30));
		vendingMachine.addProduct(new Drink(4, "Pepsi", 5, 15));
		
		//vendingMachine.Coin(30,20,10);
		vendingMachine.showProduct();
		
		//System.out.println(vendingMachine.getPriceProduct(2));
		
		System.out.println("\nTesting cash payment...");
		vendingMachine.purchaseProduct(1, new CashPayment(1 , 20.0));
		//vendingMachine.giveChange(20,15);
		//vendingMachine.purchaseProduct("Cocacola", new CashPayment(50.0));
		//vendingMachine.giveChange(50,20);
		//vendingMachine.purchaseProduct("Cocacola 1L", new CashPayment(20.0));
		//vendingMachine.giveChange(20,30);
		//vendingMachine.purchaseProduct("Pepsi", new CashPayment(20.0));
		System.out.println("\nShow Stock...");
		vendingMachine.showProduct();
		//vendingMachine.showCoin();
		
		System.out.printf("\ntotal Water %d bath", vendingMachine.getPriceProduct(1));
		
	}
}
