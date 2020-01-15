package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private LocalDate orderDate;
	private List<OrderLine> orderLine;

	public Order(int orderNum, int year, int month, int day, int lineNum, double price, double quantity) {
		this.orderNum = orderNum;
		this.orderDate = LocalDate.of(year, month, day);
		this.orderLine = new ArrayList<OrderLine>();
		OrderLine ol = new OrderLine(this, lineNum, price, quantity);
		this.orderLine.add(ol);
	}
	
	public void addLines(OrderLine line) {
		orderLine.add(line);
	}
	
	public int getOrderNum() {
		return orderNum;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public List<OrderLine> getOrderLine() {
		return orderLine;
	}
	
}
