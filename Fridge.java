class Fridge{
	static boolean isConnected = false;
	static int currentTemp ;
	public static void onOrOff(){
		if(!isConnected){
			isConnected = true ;
			System.out.println("Fridge is ON");
		}else{
			isConnected = false ;
			System.out.println("Fridge is Off");
		}
		
	}
	
	public static void tempUp(){
		if(isConnected){
			if(currentTemp<30){
				currentTemp += 1;
				System.out.println("The current Temperature is "+currentTemp);
			}else
				System.out.println("The Temperature is maximum reached");
		}else System.out.println("Turn on the Fridge");
		
	}
	
	public static void tempDown(){
		if(isConnected){
			if(currentTemp>0){
				currentTemp -= 1;
				System.out.println("The current Temperature is "+currentTemp);
					
			}else
				System.out.println("The Temperature is minimum reached");
		}else System.out.println("Turn on the Fridge");
		
	}
}