class BaccaBucciSuperstar{
	static String brand ="Bacca Bucci Superstar";
	static	int id = 11;
	static	String closureType = "Lace-Up";
	static	String heelType = "Flat";
	public static void main(String b[]){
		System.out.println("Before re-intialization");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println();
		
		brand ="Bacca Bucci";
		id = 12;
		closureType = "Lace";
		heelType = "heel";
		System.out.println("After re-intialization");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println();
		
		updateBaccaBucciSuperstar();
		System.out.println("After re-intialization by using methods");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		
		
	}
	public static void updateBaccaBucciSuperstar(){
		brand ="Bacca Buccimens";
		id = 13;
		closureType = "normal";
		heelType = "up";
	}
}