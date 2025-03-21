class SwiggyRunner{
	public static void main(String args[]){
		String order=Swiggy.takeOrder("Burger");
		System.out.println(order);
		boolean orderWithQuantity = Swiggy.takeOrder("Burger",2);
		System.out.println(orderWithQuantity);
	}
}