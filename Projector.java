class Projector{
	static boolean isConnected = false;
	static int currentZoom ;
	public static void onOrOff(){
		if(!isConnected){
			isConnected = true ;
			System.out.println("Projector is ON");
		}else{
			isConnected = false ;
			System.out.println("Projector is Off");
		}
		
	}
	
	public static void zoomUp(){
		if(isConnected){
			if(currentZoom<100){
				currentZoom += 10;
				System.out.println("The current Zoom is "+currentZoom+"%");
			}else
				System.out.println("The Zoom is maximum reached");
		}else System.out.println("Turn on the Projector");
		
	}
	
	public static void zoomDown(){
		if(isConnected){
			if(currentZoom>10){
				currentZoom -= 10;
				System.out.println("The current Zoom is "+currentZoom+"%");
					
			}else
				System.out.println("The Zoom is minimum reached");
		}else System.out.println("Turn on the Projector");
		
	}
}