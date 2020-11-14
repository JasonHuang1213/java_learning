package homework4;

public class LocalParts extends MachinePart {
	private double materialAmount;
	private double unitPrice;
	
	public LocalParts(String name, int number, double materialAmount, double unitPrice) {
		super(name, number);
		this.materialAmount = materialAmount;
		this.unitPrice = unitPrice;
	}
	public double getMaterialAmount() {
		return materialAmount;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public double calculateValue() {
		return this.materialAmount * this.unitPrice * this.getNumber();
	}
	public String toString() {
		return  this.getName() + ":\t" + this.getNumber() + "\t" + materialAmount + "kg \t" + unitPrice + "£/kg";
	}
}
