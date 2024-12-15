package jpin_0308;

public class QuantityLimit {
	Order limit;
	QuantityLimit next;
	
	public QuantityLimit(Order order)
	{
		this.limit = order;
	}

//	public void Check()
//	{
//		if()
//		{
//			
//		}
//	}
//	
//	public QuantityLimit setNext(Order next)
//	{
//		return this.next.setNext(next);
//	}

}
