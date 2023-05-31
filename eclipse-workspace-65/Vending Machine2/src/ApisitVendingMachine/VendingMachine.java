package ApisitVendingMachine;

import java.util.HashMap;

import Cash.CashPayment;
import Cash.PaymentMethod;

public class VendingMachine {
	private HashMap<Integer, Product> products = new HashMap<>();
	private HashMap<Integer, CashPayment> cashPayments = new HashMap<>();
	private double cashInserted;
	private int coin10;
	private int coin5;
	private int coin1;
	
	
	public VendingMachine() {
		products = new HashMap<>();
		cashPayments = new HashMap<>();
		cashInserted = 0;
	}	
	
	public void addProduct(Product product) {
		products.put(product.getID(), product);
	}
	
	public void removeProduct(Integer productID) {
		products.remove(productID);
	}
	
	public void showProduct() {
		System.out.println("Products in the vending machine: ");
		for (Product product : products.values()) {
			System.out.printf(" - ID: %d Name: %s (Quantity: %d, Price: %d)\n", product.getID(), product.getName(), product.getQuantity(), product.getPrice());
		}
	}
	
	public int getPriceProduct(Integer productID) {
		Product product = products.get(productID);
		if (product != null) {
		return product.getPrice();
		} else {
			System.out.println("Product not found.");
			return 0;
		}
	}
	
	//
	public void addCash(CashPayment cashPayment) {
		cashPayments.put(cashPayment.getID(), cashPayment);
	}
	
	public void insertCash(double cash) {
		cashInserted += cash;
	}
	
	public boolean purchaseProduct(Integer productID, PaymentMethod paymentMethod) {
		Product product = products.get(productID);
		CashPayment cash = cashPayments.get(paymentMethod);
		int num = 0;
		
		if (product != null && product.getQuantity() > 0) {
			if (paymentMethod.processPayment(product.getPrice())) {
				product.setQuantity(product.getQuantity() - 1);
				System.out.println("Product purchased: " + product.getName());
				return true;
			} else {
				System.out.println("Payment failed.");
				return false;
			}
		} else {
			System.out.println("Product not available.");
			return false;
		}
	}
	
	public void Coin(int coin10, int coin5, int coin1) {
		this.coin10 = coin10;
		this.coin5 = coin5;
		this.coin1 = coin1;
	}
	
	public int getCoin10() { return coin10; }
	
	public int getCoin5() { return coin5; }
	
	public int getCoin1() { return coin1; }
	
	public void setCoin10(int coin10) { this.coin10 += coin10; }
	
	public void setCoin5(int coin5) { this.coin5 += coin5; }
	
	public void setCoin1(int coin1) {this.coin1 += coin1;}
	
	public void giveChange(int paymentAmount, int productPrice) {
		//double cash = cashPayment.getCashPayment();
		int change = paymentAmount - productPrice;
		
		int coin10s = Math.min(change / 10, this.coin10);
		change -= coin10s * 10;
		this.coin10 -= coin10s;
		
		int coin5s = Math.min(change / 5, this.coin5);
		change -= coin5s * 5;
		this.coin5 -= coin5s;
		
		int coin1s = Math.min(change, this.coin1);
		change -= coin1s;
		this.coin1 -= coin1s;
		
		System.out.printf("Change given: %d (10 baht), %d (5 baht), %d (1 baht)\n", coin10s, coin5s, coin1s);
		
		if (change > 0) {
			System.out.printf("Sorry, could not give %d baht in change.\n", change);
		}
	}
	
	public void showCoin() {
		System.out.println("\nCoin 10 Bath : " + coin10);
		System.out.println("\nCoin 5 Bath : " + coin5);
		System.out.println("\nCoin 1 Bath : " + coin1);
	}
	
}
