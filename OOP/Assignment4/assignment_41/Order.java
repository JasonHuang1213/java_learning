package assignment_41;
import java.util.ArrayList;

public class Order {
	private int id;
	private String customerName;
	private Date orderDate;
	private ArrayList<Orderline> orderLine = new ArrayList<>();
	
	//constructor
	public Order(int id, String customerName, Date orderDate) {
		this.id = id;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	
	public void addOrder(Orderline newOrder) {
		orderLine.add(new Orderline(newOrder.getName(),newOrder.getPrice(),newOrder.getQuantity()));
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
		for(int i=0; i<orderLine.size(); i++) {
			total += orderLine.get(i).getPrice() * orderLine.get(i).getQuantity();
		}
		return total;
	}
	
	public String toString(Orderline order) {
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append(order.getName());
		stringbuilder.append("\t\t");
		stringbuilder.append(order.getPrice());
		stringbuilder.append("\t");
		stringbuilder.append(order.getQuantity());
		
		String str = stringbuilder.toString();
		return str;
	}
	
}