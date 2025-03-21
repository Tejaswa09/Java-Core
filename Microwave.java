class Microwave{
	static boolean isConnected = false;
	static int currentTemp ;
	public static void onOrOff(){
		if(!isConnected){
			isConnected = true ;
			System.out.println("Microwave is ON");
		}else{
			isConnected = false ;
			System.out.println("Microwave is Off");
		}
		
	}
	
	public static void tempUp(){
		if(isConnected){
			if(currentTemp<150){
				currentTemp += 1;
				System.out.println("The current Temperature is "+currentTemp);
			}else
				System.out.println("The Temperature is maximum reached");
		}else System.out.println("Turn on the microwave");
		
	
		
	}
	
	public static void tempUp(){
		if(isConnected){
			if(currentTemp<150){
				currentTemp += 1;
				System.out.println("The current Temperature is "+currentTemp);
			}else
				System.out.println("The Temperature is maximum reached");
		}else System.out.println("Turn on the microwave");
		

}