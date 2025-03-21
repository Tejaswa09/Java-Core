class Ac{
	static boolean isConnected= false;
	static int currentTemperature ;
	static int maxTemperature = 6;
	static int minTemperature;
	
	
	public static void onOff(){
		
		if(isConnected== false){
			isConnected= true;
			System.out.println("AC ON");
			
		}else{
			isConnected = false;
			System.out.println("AC OFF");
		}
	}
	
	public static void increaseTemperature(){
		if (isConnected){
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature + 1;
				System.out.println (currentTemperature);
			}else{
				System.out.println("AC is in max temperature");
			}
		}else{
			System.out.println("AC is Not connected");
		}
	}
	public static void decreaseTemperature(){
		if (isConnected){
			if(currentTemperature => minTemperature){
				currentTemperature = currentTemperature - 1;
				System.out.println (currentTemperature);
			}else{
				System.out.println("AC is in min temperature");
			}
		}else{
			System.out.println("AC is Not connected");
		}
	}
}