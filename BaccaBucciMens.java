class BaccaBucciMens{
	static String brand ="Bacca Bucci";
	static	int id = 10;
	static	String closureType = "Lace-Up";
	static	String heelType = "Flat";
	static	String soleMaterial = "Rubber";
	static	String style = "low Top";
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
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		brand ="Bacca Bucci mens";
		id = 11;
		closureType = "Lace-down";
		heelType = "Flat";
		soleMaterial = "Rubber";
		style = "low Top";
		countryOfOrigin  = "India";
		isWaterResistant = true;
		System.out.println("After re-intialize");
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
		updateBaccaBucciMens();
		System.out.println("brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		System.out.println("sole Material"+soleMaterial);
		System.out.println("style "+style);
		System.out.println("country of origin "+countryOfOrigin);
		System.out.println("Water resistant "+isWaterResistant);
		System.out.println();
		
	}
	public static void updateBaccaBucciMens(){
		brand ="Bacca Bucci womens";
		id = 13;
		closureType = "Normal";
		heelType = "High heels";
		soleMaterial = "Polymer";
		style = "low Top";
		countryOfOrigin  = "India";
		isWaterResistant = true;
		
	}
}