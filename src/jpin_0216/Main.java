package jpin_0216;

public class Main {

	public static void main(String[] args) {
		Item item1 = new Item("apple",new Price(100));
		Item item2 = new Item("banana",new Price(80));
		
		Order o1 = new Order(item1,new Quantity(3));
		Order o2 = new Order(item2,new Quantity(5));
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(o1);
		cart.add(o2);
		
		System.out.println(cart.getTotal());
		
		

	}

}
