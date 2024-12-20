package jpin_0216;

public class Order {
	
	private Item item;
	private Quantity qty;
	
	public Order(Item item, Quantity qty) {
		super();
		this.item = item;
		this.qty = qty;
	}
	
	public Item getItem() {
		return item;
	}
	
	//小計
	public Price getSubTotal() {
		return item.getPrice().multi(qty);
	}

	public boolean isSameItem(Item target) {
		return this.item.equals(target);
	}
	
	public boolean isSameItem(Order target) {
		return this.item.equals(target.item);
	}
	
	public Order Marge(Order order) {
		if(this.isSameItem(order.item) == false)
		{
			throw new IllegalArgumentException();
		}
		return new Order(item,this.qty.Add(order.qty));
	} 
}
