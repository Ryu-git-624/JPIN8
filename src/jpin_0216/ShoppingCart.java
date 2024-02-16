package jpin_0216;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Order> orderList = new ArrayList<Order>();
	
	public void add(Order order) {
		this.orderList.add(order);
	}
	
	//合計
	public Price getTotal() {
		Price total = new Price(0);
		for(var list : this.orderList) {
			total = total.add(list.getSubTotal());
		}
		return total;
	}
}
