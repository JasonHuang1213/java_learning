package assignment_41;
import java.util.ArrayList;

public class Assignment_41 {
	public static void main(String[] args) {
		//Declare two objects and an object array
		Date today = new Date();
		Order order = new Order(123, "Charlie Brown", today);	
		ArrayList<Orderline> lineOfOrder = new ArrayList<Orderline>();
		
		//Add new elements to the object array
		lineOfOrder.add(new Orderline("Pencile", 2.5, 100));
		lineOfOrder.add(new Orderline("Book", 25, 10));
		lineOfOrder.add(new Orderline("Latop", 1000, 2));
		
		order.addOrder(lineOfOrder.get(0));
		order.addOrder(lineOfOrder.get(1));
		order.addOrder(lineOfOrder.get(2));
		
		System.out.println("OrderID: " + order.getId());
		System.out.println("Customer: " + order.getCustomerName());
		System.out.println("Order Date: " + order.getOrderDate());
		
		System.out.println("Product\t\tPrice\tQuantity");
		System.out.println(order.toString());
		System.out.println("Total price: " + order.totalPrice());
	}
}