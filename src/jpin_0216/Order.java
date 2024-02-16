package jpin_0216;

public class Order {
	
	private Item item;
	private Quantity qty;
	
	public Order(Item item, Quantity qty) {
		super();
		this.item = item;
		this.qty = qty;
	}
	
	//小計
	public Price getSubTotal() {
		return item.getPrice().multi(qty);
	}
	

}
