class ElectricKettle {
	static int id = 17;
    static  String brand = "Hamilton Beach";
    static  String model = "Glass Electric Kettle";
    public static void main(String args[]) {
		System.out.println("Before re-int");
		String.out.println("id"+id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        
		id = 18;
        brand = "Hamilton";
        model = "stainsteel Electric Kettle";
		System.out.println("After re-int");
		String.out.println("id"+id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
		
		updateElectricKettle();
        System.out.println("After re-int using method");
		String.out.println("id"+id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
	public static void updateElectricKettle(){
		id = 17;
        brand = "luis hamilton";
        model = "steel Electric Kettle";
	}
}