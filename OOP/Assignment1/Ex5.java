package exercise;

public class Ex5 {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.setName("food");
		order1.setPrice(5.5);
		order1.setQuantity(10);
		System.out.println("Order Data: \n");
		System.out.println("Name: " + order1.getName());
		System.out.println("Price: " + order1.getPrice());
		System.out.println("Quantity: " + order1.getQuantity());
		System.out.println("Totol Price: " + order1.orderLine());
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