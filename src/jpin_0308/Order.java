package jpin_0308;

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

	public boolean isSameItem(Order order) {
		return this.item.equals(order.getItem());
	}
	
	public Order Marge(Order order) {
		return new Order(item,this.qty.Add(order.qty));
	}
	

}
