package assignment_52;

public class PreferredCustomer extends Customer{
	private int purchases;

	public PreferredCustomer(int customerNumber, String name, String address, int purchases) {
		super(customerNumber, name, address);
		this.purchases = purchases;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	
	// Method calculating bonus
	public double calculateBonus() {
		if (this.purchases > 500 && this.purchases < 1000) return 0.02;
		else if (this.purchases > 1000) return 0.05;
		else return 0;
	}
		
	
}
