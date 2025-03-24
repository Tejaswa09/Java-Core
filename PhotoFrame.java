class PhotoFrame{
	int id;
	String brand;
	String size;
	
	PhotoFrame(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	PhotoFrame(int id,String brand,String size){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.brand = brand;
		this.size = size;
	}
	
	
}