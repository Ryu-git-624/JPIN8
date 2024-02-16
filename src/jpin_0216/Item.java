package jpin_0216;

public class Item {
	
	private String name;
	private Price price;
	private Type type;
	
	public Item(String name, Price price) {
		this(name,price,Type.DEBIT);
	}
	
	public Item(String name,Price price,Type type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public Price getPrice() {
		return price;
	}

}
