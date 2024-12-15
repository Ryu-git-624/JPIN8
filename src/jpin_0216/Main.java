package jpin_0216;

public class Main {

	public static void main(String[] args) {
		
		Item apple = new Item("apple",new Price(100,Currency.YEN));
		Item banana = new Item("banana",new Price(80,Currency.YEN));
		
		Order o1 = new Order(apple,new Quantity(1));
		//Order o2 = new Order(banana,new Quantity(1));
		Order o3 = new Order(apple,new Quantity(1));
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(o1);
		//cart.add(o2);
		cart.add(o3);
		
		System.out.println(cart.getTotal());
		System.out.println(cart.size());
	
	}

}
