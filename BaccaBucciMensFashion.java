class BaccaBucciMensFashion{
	static String brand ="Bacca Bucci Mens Fashion";
	static int id = 13;
	static 	String closureType = "Lace-Up";
	static 	String heelType = "Flat";
	static 	String soleMaterial = "Ethylene Vinyl Acetate";
	static 	String style = "Sneaker";
	static 	String material = "Leather";
	static 	String countryOfOrigin  = "India";
	static boolean isWaterResistant = true;
	public static void main(String b[]){
		System.out.println("Before re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println("material "+material);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		brand ="Bacca Bucci ";
		id = 14;
		closureType = "Lace-Up";
		heelType = "high heels";
		soleMaterial = "rubber";
		style = "Sneaker-up";
		material = "Leather";
		countryOfOrigin  = "India";
		isWaterResistant = true;
		System.out.println("After re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println("material "+material);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		updateBaccaBucciMensFashion();
		System.out.println("After re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println("material "+material);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		
	}
	public static void updateBaccaBucciMensFashion(){
		brand ="Bacca Bucci Womens Fashion";
		id = 15;
		closureType = "Lace";
		heelType = "normal";
		soleMaterial = "lether";
		style = "Sports shoe";
		material = "Leather";
		countryOfOrigin  = "India";
		isWaterResistant = true;
	}
}