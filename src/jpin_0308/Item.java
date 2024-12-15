package jpin_0308;

public class Item {
	
	private String name;
	private Price price;
	
	public Item(String name,Price price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public Price getPrice() {
		return price;
	}
	

}
