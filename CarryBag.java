class CarryBag{
	int id;
	String brand;
	String material;
	
	CarryBag(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	CarryBag(int id,String brand,String material){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.brand = brand;
		this.material = material;
	}
	
	
}