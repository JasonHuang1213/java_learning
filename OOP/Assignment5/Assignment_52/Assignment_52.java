package assignment_52;
import java.util.*;

public class Assignment_52 {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "Judy", "Olympiakatu"));
		customers.add(new Customer(2, "Bill", "River Road"));
		customers.add(new Customer(3, "King", "Garden Street"));
		customers.add(new PreferredCustomer(4, "Bob", "Kings Road", 400));
		customers.add(new PreferredCustomer(5, "Wang", "Queens Road", 700));
		customers.add(new PreferredCustomer(6, "London", "Mountain Street", 1200));
		
		// Data of all customers
		System.out.println("All customers' data: ");
		for (Customer user : customers) {
			System.out.println(user.toString());
		}
		
		// Preferred customers and their bonus
		System.out.println("Preferred customers data: ");
		for (Customer user : customers) {
			if (user instanceof PreferredCustomer) {
				// Downcasting with java instanceof operator
				System.out.println(((PreferredCustomer)user).toString() + ", purchases= " + ((PreferredCustomer)user).getPurchases() + ", bonus= " + ((PreferredCustomer)user).calculateBonus());
			}
		}
	}

}
