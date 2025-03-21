class Bawarchi{
	public static void main(String menu[]){
		String menuItems[]={"Hyderabad biriyai","Chicken lolly pops",
		"Chicken Grill","CHicken kabab","veg biriyani","veg soup",
		"veg manchurian","veg special biriyai","mutton dum biriyani",
		"mutton keema balls","chicken manchurian"};
		
		System.out.println("The available items are "+menuItems.length);
		for (String menuItem: menuItems){
			System.out.println(menuItem);
		}
	}
}