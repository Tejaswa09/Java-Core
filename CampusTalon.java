class CampusTalon{
	static String brand ="Campus Talon";
	static	int id = 12;
	static	String closureType = "Lace-Up";
	public static void main(String c[]){
		System.out.println("Before re-intialization");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println();
		
		brand ="Puma Talon";
		id = 13;
		closureType = "Lace";
		System.out.println("After re-intialization");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println();
		
		updateCampusTalon();
		System.out.println("After re-intialization using Methods");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		
	}
	public static void updateCampusTalon(){
		brand ="Asian Talon";
		id = 14;
		closureType = "NO lace";
	}
}