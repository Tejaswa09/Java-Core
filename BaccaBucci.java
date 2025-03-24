class BaccaBucci{
	static String brand ="BaccaBucci";
	static	int id = 9;
	static	String closureType = "Lace-Up";
	static	String heelType = "flat";
	static	String soleMaterial = "Phylon-Rubber & EVA";
	static	String style = "Walking shoe";
	static	String materialType = "Mesh";
	static	String countryOfOrigin  = "India";
	static	boolean isWaterResistant = false;
	
	public static void main(String b[]){
		System.out.println("Before re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println(" material "+materialType);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		brand ="Bacca";
		id = 10;
		closureType = "Lace-Up";
		heelType = "flat";
		soleMaterial = "Phylon-Rubber & EVA";
		style = "Walking shoe";
		materialType = "Mesh";
		countryOfOrigin  = "India";
		isWaterResistant = true;
		System.out.println("After re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println(" material "+materialType);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		updateBaccaBucci();
		System.out.println("After re-intialize using method");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println(" material "+materialType);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		
		
	}
	public static void updateBaccaBucci(){
		brand ="Gucci";
		id = 11;
		closureType = "normal";
		heelType = "high heels";
		soleMaterial = "Phylon-Rubber";
		style = "Runnnig shoe";
		materialType = "Mesh";
		countryOfOrigin  = "Germany";
		isWaterResistant = false;
		
	}
}