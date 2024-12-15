package jpin_0308;

//public class ShoppingCart {
//	
//	public List<Order> list = new ArrayList<>();
//	private DiscountBandle bandle;
//	private Map<Item,Order> map = new HashMap<>();
//	
//	public ShoppingCart()
//	{
//		Item apple = new Item("apple",new Price(100,Currency.YEN));
//		Item banana = new Item("banana",new Price(80,Currency.YEN));
//		Item o3 = new Item("credit",new Price(18,Currency.YEN,DealType.CREDIT));
//		
//		Item credit = new Item("credit",new Price(18,Currency.YEN,DealType.CREDIT));
//		Order creditOrder = new Order(credit,new Quantity(1));
//		this.bandle = new DiscountBandle(creditOrder, apple,banana);
//	}
//	
//	public void add(Order order) {
//		if(list.size() == 0)
//		{
//			map.put(order.getItem(), order);
//		}else{
//			Order old = map.get(order.getItem());
//			if(old.isSameItem(order)) {
//				map.remove(order.getItem());
//				order.Marge(old);
//			}
//
//		}
//		this.list.add(order);
//	}
//	
//	//合計
//	public Price getTotal() {
//		Price total = new Price(0,Currency.YEN);
//		for(Order list : this.list) {
//			total = total.add(list.getSubTotal());
//		}
//		return total;
//	}
//}
