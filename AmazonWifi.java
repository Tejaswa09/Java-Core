class AmazonWifi{
	static int id = 20;
	static String brand = "Amazon Basics";
	static String dataTransfer = "150 Megabits per seconds";
	static String frequencyBrandClass = "Single Band";
	static String specialFeature = "WPS";
	static String color = "Blank";
	
	public static void main(String a[]){
		System.out.println("Before re-intialize");
		System.out.println("id "+id);
		System.out.println("brand "+brand);
		System.out.println("data Transfer "+dataTransfer);
		System.out.println("frequency Brand Class "+frequencyBrandClass);
		System.out.println("special Feature "+specialFeature);
		System.out.println("color "+color);
		System.out.println();
		
		id = 21;
		brand = "Flipkart Basics";
		dataTransfer = "160 Megabits per seconds";
		frequencyBrandClass = "Double Band";
		specialFeature = "WPS";
		color = "Blue";
		System.out.println("After re-intialize");
		System.out.println("id "+id);
		System.out.println("brand "+brand);
		System.out.println("data Transfer "+dataTransfer);
		System.out.println("frequency Brand Class "+frequencyBrandClass);
		System.out.println("special Feature "+specialFeature);
		System.out.println("color "+color);
		System.out.println();
		
		updateAmazonWifi();
		System.out.println("id "+id);
		System.out.println("brand "+brand);
		System.out.println("data Transfer "+dataTransfer);
		System.out.println("frequency Brand Class "+frequencyBrandClass);
		System.out.println("special Feature "+specialFeature);
		System.out.println("color "+color);
		
	}
	public static void updateAmazonWifi(){
		id = 22;
		brand = "Mynthra Basics";
		dataTransfer = "180 Megabits per seconds";
		frequencyBrandClass = "triple Band";
		specialFeature = "WOS";
		color = "WHITE";
		
	}
}