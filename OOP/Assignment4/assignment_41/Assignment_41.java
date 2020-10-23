package assignment_41;

public class Assignment_41 {
	public static void main(String[] args) {
		Date today = new Date();
		Order order = new Order(123, "Charlie Brown", today);
		Orderline orderline1 = new Orderline("Pencil", 2.5, 100);
		Orderline orderline2 = new Orderline("Book", 25, 10);
		Orderline orderline3 = new Orderline("Laptop", 1000, 2);
		
		order.addOrder(orderline1);
		order.addOrder(orderline2);
		order.addOrder(orderline3);
		
		System.out.println("OrderID: " + order.getId());
		System.out.println("Customer: " + order.getCustomerName());
		System.out.println("Order Date: " + order.getOrderDate());
		
		System.out.println("Product\t\tPrice\tQuantity");
		
		System.out.println(order.toString(orderline1));
		System.out.println(order.toString(orderline2));
		System.out.println(order.toString(orderline3));
		System.out.println("Total price: " + order.totalPrice());
	}
}