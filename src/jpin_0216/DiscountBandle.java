package jpin_0216;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DiscountBandle {
	
	Map<Item,Order> map = new HashMap<>();
	private Order discountOrder;
	
	public DiscountBandle(Order result,Item...items) {
		super();
		this.discountOrder = result;
		for(Item item : items) {
			this.map.put(item, null);
		}
	}

	public void tryBundle(Order order) {
		Set<Item> keys = map.keySet();
		for(Item item : keys)
		{
			if(order.isSameItem(item)) {
				map.put(item, order);
				return;
			}
		}
	}
	
	public Order getDiscountOrder() {
		if(this.map.containsValue(null)) {
			return null;
		}
		return discountOrder;
	}
}
