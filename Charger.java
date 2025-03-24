class Charger{
	static int id = 1;
	static	String brand = "Red cable";
	static	String color = "Red";
	static	String power = "2 Wats";
	static	String type = "Mobile charger";
	public static void main(String charger[]){
		System.out.println("before re-intialization");
		System.out.println("The id of Charger is "+id);
		System.out.println("The color of charger is "+color);
		System.out.println("The power output of the charger is"+power);
		System.out.println("The type of the charger is "+type);
		System.out.println();
		
		int id = 2;
		brand = "realme";
		color = "yellow";
		power = "2 Wats";
		type = "Mobile charger";
		System.out.println("After re-intialization");
		System.out.println("The id of Charger is "+id);
		System.out.println("The color of charger is "+color);
		System.out.println("The power output of the charger is"+power);
		System.out.println("The type of the charger is "+type);
		System.out.println();
	
		updateCharger();
		System.out.println("After re-intialization using Methods");
		System.out.println("The id of Charger is "+id);
		System.out.println("The color of charger is "+color);
		System.out.println("The power output of the charger is"+power);
		System.out.println("The type of the charger is "+type);
		
	}
	public static void updateCharger(){
		int id = 3;
		brand = "realme";
		color = "white";
		power = "2 Wats";
		type = "laptop charger";
	}
}