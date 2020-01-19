package lab5.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	
	void addOrder(Order order) {
		orders.add(order);
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Return unmodifiable list 
	 * @return
	 */
	public List<Order> getOrders() throws UnsupportedOperationException{
		return Collections.unmodifiableList(orders);
	}
}
