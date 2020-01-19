package lab5.question4.extpackage;

import java.time.LocalDate;
import java.util.List;

import lab5.question4.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.getCustomer("Bob");
		Order order = CustOrderFactory.addOrderToCustomer(cust, LocalDate.now());
		CustOrderFactory.addItemToOrder(order, "Shirt");
		CustOrderFactory.addItemToOrder(order, "Laptop");

		order = CustOrderFactory.addOrderToCustomer(cust, LocalDate.now());
		CustOrderFactory.addItemToOrder(order, "Pants");
		CustOrderFactory.addItemToOrder(order, "Knife set");

//		try {
//			// testing unmodifiable list
//		List<Order> orders = cust.getOrders();
//		orders.add(order);} catch (UnsupportedOperationException ex) {
//			ex.printStackTrace();
//		}
		System.out.println(cust.getOrders());
	}
}

		
