class Beverages {
	static String brand = "Tribe";
	static	int id = 16;
	static	String item = "Liquid";
	public static void main(String args []){
		System.out.println("Before re-intialization");
		System.out.println("id "+id);
		System.out.println("The brand of Beverages is "+brand);
	    System.out.println("The item of the Beverages is "+item);
		System.out.println();
		
		brand = "Tibute";
		id = 17;
		item = "Liquid";
		System.out.println("After re-intialization");
		System.out.println("id "+id);
		System.out.println("The brand of Beverages is "+brand);
	    System.out.println("The item of the Beverages is "+item);
		System.out.println();
		
		updateBeverages();
		System.out.println("id "+id);
		System.out.println("The brand of Beverages is "+brand);
	    System.out.println("The item of the Beverages is "+item);
	}
	public static void updateBeverages(){
		brand = "tt";
		id = 18;
		item = "Liquid";
	}
}