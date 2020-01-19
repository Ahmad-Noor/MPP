package lab5.question4;

import java.time.LocalDate;

public class CustOrderFactory {
	
	/**
	 * Factory method to instantiate a customer object
	 * @param name Customer name
	 * @return Customer object
	 */
	public static Customer getCustomer (String name) {
		return new Customer(name);
	}
	
	/**
	 * Factory method to add Order to Customer
	 * @param customer Owning customer
	 * @param orderDate The Date of Order
	 * @return Newly created Order object
	 */
	public static Order addOrderToCustomer (Customer customer, LocalDate orderDate) {
		return Order.newOrder(customer, orderDate);
	}
	
	/**
	 * Add Item to a given order
	 * @param order Order having the item
	 * @param itemName Name of item 
	 */
	public static void addItemToOrder (Order order, String itemName) {
		order.addItem(itemName);
	}
}
