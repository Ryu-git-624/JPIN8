package jpin_0216;

public class Price {
	private final int amount;

	public Price(int amount) {
		super();
		if(amount < 0 || 100000 < amount) {
			throw new IllegalArgumentException();
		}
		this.amount = amount;
	}
	
	public Price multi(Quantity qty)
	{
		return new Price(this.amount * qty.getSize());
	}
	
	public Price add(Price target) {
		return new Price(this.amount+target.amount);
	}
	
	public String toString() {
		return Integer.toString(amount);
		
	}

}
