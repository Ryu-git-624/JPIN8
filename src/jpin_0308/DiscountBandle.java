package jpin_0308;

import java.util.HashMap;
import java.util.Map;

public class DiscountBandle {
	
	Map<Item,Item> map = new HashMap<>();
	private Order result;
	
	public DiscountBandle(Order result,Item...items) {
		super();
		this.result = result;
		for(Item item : items) {
			this.map.put(item, null);
		}
	}

	public void add(Item item) {
		Item target = this.map.get(item);
		
			if(item != null)
			{
				this.map.put(target, item);
			}
	}
	
	public Order getDiscountOrder() {
		if(this.map.containsValue(null)) {
			return null;
		}
		return result;
	}
}
