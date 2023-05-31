package Cash;

import ApisitVendingMachine.VendingMachine;

public class CashPayment extends VendingMachine implements PaymentMethod {
	private int ID;
	private double cashInserted;
	
	public CashPayment() {

	}
	
	public CashPayment(int ID, double cashInserted) {
		this.ID = ID;
		this.cashInserted = cashInserted;
	}
	
	public int getID() { return this.ID; }
	
	public void setID(int ID) { this.ID = ID; }
	
	public double getCashPayment() {
		return cashInserted;
	}
	
	public boolean processPayment(double amount) {
		if(cashInserted >= amount) {
			System.out.println("Payment accepted: Pass");
			return true;
		} else {
			System.out.println("Payment not accepted: Sold Out");
			return false;
		}
	}

}
