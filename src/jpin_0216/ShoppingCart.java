package jpin_0216;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
	
	public List<Order> list = new ArrayList<>();
	private Map<Item,Order> map = new HashMap<>();
	private DiscountBandle bandle;
	
	public ShoppingCart()
	{
		Item apple = new Item("apple",new Price(100,Currency.YEN));
		Item banana = new Item("banana",new Price(80,Currency.YEN));		
		Item credit = new Item("credit",new Price(18,Currency.YEN,DealType.CREDIT));
		
		Order creditOrder = new Order(credit,new Quantity(1));
		this.bandle = new DiscountBandle(creditOrder, apple,banana);
	}
	
	public void add(Order order) {

		if(this.list.size() == 0)
		{
			this.list.add(order);
			this.map.put(order.getItem(), order);
		}else{
			
			Order old = this.map.get(order.getItem());
			if(old != null)
			{
				order = old.Marge(order);
			}
			
			this.list.remove(old);
			this.add(order);
			this.map.put(order.getItem(), order);
		}
		
		this.bandle.tryBundle(order);
		Order result = this.bandle.getDiscountOrder();
		if(result != null) {
			this.list.add(result);
		}
	}
	
	//合計
	public Price getTotal() {
		Price total = new Price(0,Currency.YEN);
		for(Order list : this.list) {
			total = total.add(list.getSubTotal());
		}
		return total;
	}
	
	public int size()
	{
		return this.list.size();
	}
}
