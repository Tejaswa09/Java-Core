class Airport{
	    static int id = 5;
		static String name = "Kempegowda International Airport";
		static String location = "Bengalore";
		static int noOfTerminals = 7;
		static String type = "International";
		
	public static void main(String charger[]){
		System.out.println("Before re-int");
		System.out.println("The id of Airport is "+id);
		System.out.println("The name of Airport is "+name);
		System.out.println("The location of the Airport is"+location);
		System.out.println("The number of the Terminals is "+noOfTerminals);
		System.out.println("Type of Airport is "+type);
		System.out.println();
		
		id = 4;
		name = "Rajeev gandhi international airport";
		location = "Hyderabad";
		noOfTerminals = 9;
		type = "International";
		System.out.println("After re-int");
		System.out.println("The id of Airport is "+id);
		System.out.println("The name of Airport is "+name);
		System.out.println("The location of the Airport is"+location);
		System.out.println("The number of the Terminals is "+noOfTerminals);
		System.out.println("Type of Airport is "+type);
		System.out.println();
		
		updateAirport();
		System.out.println("After re-int using method");
		System.out.println("The id of Airport is "+id);
		System.out.println("The name of Airport is "+name);
		System.out.println("The location of the Airport is"+location);
		System.out.println("The number of the Terminals is "+noOfTerminals);
		System.out.println("Type of Airport is "+type);
		
	}
	public static void updateAirport(){
		id = 6;
		name = "Netaji subhash chandra bose";
		location = "kolkata";
		noOfTerminals = 9;
		type = "International";
	}
}