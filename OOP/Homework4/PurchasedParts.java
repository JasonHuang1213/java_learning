package homework4;

public class PurchasedParts extends MachinePart {
	private double price;
	
	public PurchasedParts(String name, int number, double price) {
		super(name,number);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public double calculateValue() {
		return this.getNumber() * this.price;
	}

	public String toString() {
		return this.getName() + ":\t" + this.getNumber() + "\t" + price + "£";
	}
}
