class Area{
	static int pinCodes[]={584128,577102,577101};
	public static void main(String a[]){
		System.out.println("Start of the main ");
		getPinCode();
		System.out.println("end of the main ");
	
	}
	//<access-modifier/specifier> returnType methodName(parameter n)
	public static void getPinCode(){
		System.out.println("Starting of Method");
		for (int pinCode:pinCodes){
			System.out.println(pinCodes);

		}
		System.out.println("end of Method");

	}	
}