import java.util.*;

public class Expense {
	private String category;
	private double amount;
	private String description;
	private static final String[] CATEGORIES = {
		"Food", "Transport", "Shopping", "Leisure", "Healthcare", "Household", "Services", "Other"
	};
	
	public Expense() {
		Scanner input = new Scanner(System.in);
		String in = "";
		System.out.print("Enter the category (Food, Transport, Shopping, Leisure, Healthcare, Household, Services, Other): ");
		in = input.nextLine();
		if (contains(in)) {
			this.category = in;
		} else {
			throw new IllegalArgumentException("Please give the correct category.");
		}
		System.out.print("Enter the amount: ");
		this.amount = input.nextDouble();
		System.out.print("Enter the description: ");
		input.nextLine();
		this.description = input.nextLine();
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	// contains method to check if the user input category name matches the CATEGORIES constant
	public boolean contains(String str) { 
		boolean result = false;
		for (String category : CATEGORIES) { 
			if (str.equals(category)) { 
				result = true;
				break; 
			} 
	  }
		return result; 
	}
	
	
	@Override
	public String toString() {
		return "" + this.category + " " + this.amount + " " + this.description; 
	}
	
}
