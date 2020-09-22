package exercise;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many orders: ");
		int num = input.nextInt();
		Order[] orders = new Order[num]; // allocate order arrays
		
		for(int i = 0; i < num; i++) {
			input.nextLine(); // skip the line break
			
			orders[i] = new Order();
			System.out.println("Name of the order " + (i+1));
			orders[i].setName(input.nextLine());
			System.out.println("Price of the order " + (i+1));
			orders[i].setPrice(input.nextDouble());
			System.out.println("Quantity of the order " + (i+1));
			orders[i].setQuantity(input.nextInt());
		}
		
		System.out.println("Followings are all orders: ");
		for(int i = 0; i < num; i++) {
			System.out.println("Name: " + orders[i].getName());
			System.out.println("Price: " + orders[i].getPrice());
			System.out.println("Quantity: " + orders[i].getQuantity());
			System.out.println("Total Price: " + orders[i].orderLine());
			System.out.println("\n");
		}

	}
	
	public static class Order {
		private String name;
		private double price;
		private int quantity;
		
		
		// setters
		public void setName(String name) {
			this.name = name;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		// getters 
		public String getName() {
			return name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		// return price of order line
		public double orderLine() {
			return quantity*price;
		}
	}
}