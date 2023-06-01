package Cash;

import ApisitVendingMachine.VendingMachine;

public class Cash implements PaymentMethod {
	private int ID;
	private int cash;
	
	public Cash(int ID, int cash) {
		this.ID = ID;
		this.cash = cash;
	}
	
	public int getID() { return this.ID; }
	
	public void setID(int ID) { this.ID = ID; }
	
	public int getCash() { return this.cash; }
	
	public void setCash(int cash) { this.cash = cash; }
	
	public int processPayment(int paymentNum, int amount) {
		if(cash >= amount) {
			cash -= amount;
			System.out.println(" - Payment accepted: Pass");
			return amount;
		} else {
			System.out.println(" - Payment not accepted: Sold Out");
			return -1;
		}
	}

}
