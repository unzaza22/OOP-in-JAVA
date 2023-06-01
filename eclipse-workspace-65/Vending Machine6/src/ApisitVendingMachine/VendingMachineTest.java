package ApisitVendingMachine;

import Cash.Cash;

public class VendingMachineTest {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
	
		machine.addProduct(new Drink(1, "ACQHA PANNA", 10, 49));
		machine.addProduct(new Drink(2, "Cool Cool FRESH", 10, 10));
		machine.addProduct(new Snack(3, "SNACK JACK", 10, 13));
		
		machine.setProductPromotion(1, true, 0.06);
		machine.setBuyOneFreeOne(3, true);
		
		machine.showProduct();
		
		machine.addCoin(1, 50);
		machine.addCoin(5, 50);
		machine.addCoin(10, 50);
		
		System.out.println();
		Cash cash1 = new Cash(1,20);
		Cash cash2 = new Cash(2,100);
		Cash cash3 = new Cash(3,30);
		machine.addCash(cash1);
		machine.addCash(cash2);
		machine.addCash(cash3);
		machine.showCash();
		
			
		System.out.println();
		System.out.println("\nPut ID want buy (productID, cashID) Buy a Product: AQHA PANNA");
		machine.purchaseProduct(1, 2);
		System.out.println("\nPut Cash (cashID) Give money:");
		machine.getChange(2);
		
		System.out.println();
		System.out.println("\nPut ID want buy (productID, cashID) Buy a Product: ACQHA PANNA FAIL case");
		machine.purchaseProduct(1, 3);
		System.out.println("\nPut Cash (cashID) Give money: ");
		machine.getChange(3);
		
		System.out.println();
		System.out.println("\nPut ID want buy (productID, cashID) Buy a Product: SNACK Promotion case");
		machine.purchaseProduct(3, 3);
		System.out.println("\nPut Cash (cashID) Give money: ");
		machine.getChange(3);
			
	}
}
