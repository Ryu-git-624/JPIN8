package jpin_0216;

import java.util.Objects;

public class Price {
	private final int amount;
	private final jpin_0216.Currency currency;
	private DealType type;

	public Price(int amount,jpin_0216.Currency yen) {
		this(amount,yen,DealType.DEBIT);
	}
	
	public Price(int amount,jpin_0216.Currency currency,DealType type)
	{
		super();
		if(amount < 0 || 100000 < amount) {
			throw new IllegalArgumentException();
		}
		
		this.amount = amount;
		this.currency = currency;
		this.type = type;
	}
	
	public boolean isCredit()
	{
		return this.type == DealType.CREDIT;
	}
	
	public Price multi(Quantity qty)
	{
		return new Price(this.amount * qty.getSize(),currency,type);
	}
	

	public Price add(Price target) {
		if(this.currency != target.currency) {
			throw new IllegalArgumentException();
		}
		
		if(this.isCredit() && target.isCredit())
		{
			return new Price(this.amount + target.amount,currency,DealType.CREDIT);
		}
		
		if(this.isCredit()) {
			return new Price(target.amount - this.amount,currency,DealType.DEBIT);
		}
		
		if(target.isCredit())
		{
			return new Price(this.amount - target.amount,currency,DealType.DEBIT);
		}
		
		return new Price(this.amount+target.amount,currency,DealType.DEBIT);
		
	}
	
	public String toString() {
		return Integer.toString(amount);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(amount, currency, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Price other = (Price) obj;
		return amount == other.amount && currency == other.currency && type == other.type;
	}


}
