class Speaker{
	static boolean isConnected = false;
	static int currentVolume ;
	public static void onOrOff(){
		if(!isConnected){
			isConnected = true ;
			System.out.println("Speaker is ON");
		}else{
			isConnected = false ;
			System.out.println("Speaker is Off");
		}
		
	}
	
	public static void volumeUp(){
		if(isConnected){
			if(currentVolume<10){
				currentVolume += 1;
				System.out.println("The current volume is "+currentVolume);
			}else
				System.out.println("The volume is maximum reached");
		}else System.out.println("Turn on the speaker");
		
	}
	
	public static void volumeDown(){
		if(isConnected){
			if(currentVolume>10){
				currentVolume -= 1;
				System.out.println("The current volume is "+currentVolume);
					
			}else
				System.out.println("The volume is minimum reached");
		}else System.out.println("Turn on the speaker");
		
	}
}