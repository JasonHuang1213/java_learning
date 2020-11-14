package homework4;

// abstract class
public abstract class MachinePart {
	private String name;
	private int number;
	
	public MachinePart(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	
	// abstract methods
	public abstract double calculateValue();
	public abstract String toString();
}
