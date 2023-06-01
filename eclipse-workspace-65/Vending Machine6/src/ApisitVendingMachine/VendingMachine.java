package ApisitVendingMachine;

import java.util.HashMap;
import java.util.Map;

import Cash.Cash;
import Cash.PaymentMethod;
import Coin.Coin;

public class VendingMachine {
	private HashMap<Integer, Product> products;
	private HashMap<Integer, Cash> cashs;
	private Map<Integer, Coin> coins;
	
	public VendingMachine() {
		products = new HashMap<>();
		cashs = new HashMap<>();
		coins = new HashMap<>();
	}	
	///////////////////////////////////////////////////////////////////
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
	
	public boolean purchaseProduct(Integer productID, int paymentNum) {
		Product product = products.get(productID);
		Cash cashPay = cashs.get(paymentNum);
		
		if (product != null && product.getQuantity() > 0) {
			int paymentAmount  = cashPay.processPayment(paymentNum, product.getPrice());
			if (paymentAmount >= 0) {
				if (product.getPromo(productID)) {
					product.setQuantity(product.getQuantity() - 2);
					System.out.println(" - Product purchased: " + product.getName() + " (Buy 1 Get 1 promotion applied!)");
				} else {
					product.setQuantity(product.getQuantity() - 1);
					System.out.println(" - Product purchased: " + product.getName());
				}
				return true;
			} else {
				System.out.println(" - Payment failed.");
				return false;
			}
		} else {
			System.out.println(" - Product not available.");
			return false;
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////
	
	public void addCash(Cash cash) {
		cashs.put(cash.getID(), cash);
	}
	
	public void showCash() {
		System.out.println("CashPayment in the vending machine: ");
		for (Cash cash : cashs.values()) {
			System.out.printf(" - ID: %d Payment: %d Bath\n", cash.getID(), cash.getCash());
		}
	}
	
	public int getCash(Integer cashID) {
		Cash cash = cashs.get(cashID);
		if (cash != null) {
		return cash.getCash();
		} else {
			System.out.println(" - Cash not found.");
			return 0;
		}
	}
	
	/////////////////////////////////////////////////////////////////////
	
	public void addCoin(int value, int quantity) {
		Coin coin = this.coins.get(value);
		
		if (coin != null) {
			coin.increaseQuantity(quantity);
		} else {
			this.coins.put(value, new Coin(value, quantity));
		}
	}
	
	public void decreaseCoin(int value) {
		Coin coin = this.coins.get(value);
		
		if (coin != null) {
			coin.decreaseQuantity();
		}
	}
	
	public int getCoinQuantity(int value) {
		Coin coin = this.coins.get(value);
		
		if (coin != null) {
			return coin.getQuantity();
		}
		
		return 0;
	}
	
	public int getChange(int amount) {
		amount = getCash(amount);
		int change = 0;
		int[] coinValues = {10,5,1};
		
		for(int coinValue : coinValues) {
			int coinCount = 0;
			while (amount >= coinValue && getCoinQuantity(coinValue) > 0) {
				coinCount++;
				change += coinValue;
				decreaseCoin(coinValue);
				amount -= coinValue;
			}
			if(coinCount > 0) {
				System.out.println(" - Returned " + coinCount + " coins of value " + coinValue);
			}
		}
		System.out.println(" - Chage: " + change + " Bath");
		
		return change;
	}
	/////////////////////////////////////////////////////////////////////
	
	public void setProductPromotion(int productID, boolean isOnPromotion, double discountRate) {
		Product product = products.get(productID);
		
		if (product != null) {
			product.setPromotion(isOnPromotion, discountRate);
		}
	}
	
	public void setBuyOneFreeOne(Integer productID, boolean isPromo) {
		Product product = products.get(productID);
		
		if (product != null) {
			product.setPromo(productID, isPromo);
		}
	}
	
	/////////////////////////////////////////////////////////////////////
}
