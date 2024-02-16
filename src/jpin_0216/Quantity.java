package jpin_0216;

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
	
}
