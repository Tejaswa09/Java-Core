class Neeman{

	    static String brand ="Neeman Shoes";
		static int id = 8;
		static String closureType = "Lace-Up";
		static String heelType = "No Heel";

	public static void main(String ne[]){


		System.out.println(Before Re-init);
		System.out.println("Brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);

		 brand ="Bata Shoes";
		 id = 10;
		 closureType = " No Lace-Up";
		 heelType = " Heel";

		
		 updateNeeman();
		 System.out.println(After Re-init);
		 System.out.println("Brand "+brand);
		System.out.println("Id "+id);
		System.out.println("Closure Type "+closureType);
		System.out.println("heel type "+heelType);
		
		
	}
	public static void updateNeeman(){
		brand ="Bata Shoes";
		 id = 10;
		 closureType = " No Lace-Up";
		 heelType = " Heel";
	}
}