package assignment_41;
import java.util.ArrayList;

public class Order {
	private int id;
	private String customerName;
	private Date orderDate;
	private ArrayList<Orderline> lineOfOrder = new ArrayList<>();
	
	//constructor
	public Order(int id, String customerName, Date orderDate) {
		this.id = id;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	
	public void addOrder(Orderline newOrder) {
		lineOfOrder.add(new Orderline(newOrder.getName(),newOrder.getPrice(),newOrder.getQuantity()));
	}
	
	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	
	public double totalPrice() {
		double total = 0;
		for(Orderline order : lineOfOrder) {
			total += order.getPrice() * order.getQuantity();
		}
		return total;
	}

	
	public String toString() {
		StringBuilder orderString = new StringBuilder();
		for(Orderline order : lineOfOrder) {
			orderString.append(order.getName());
			orderString.append("\t\t");
			orderString.append(order.getPrice());
			orderString.append("\t");
			orderString.append(order.getQuantity());
			orderString.append("\n");
		}
		
		String str = orderString.toString();
		return str;
	}
	
}