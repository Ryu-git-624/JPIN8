package jpin_0308;

public class Quantity {
	private final int size;

	public Quantity(int size) {
		super();
		if(size < 0 || 100 < size) {
			throw new IllegalArgumentException();
		}
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
	public Quantity Add(Quantity quantity)
	{
		return new Quantity(this.size + quantity.size);
	}
	
//	public boolean isLessThan(Order target)
//	{
//		return this.size > target.get
//	}
	
}
