class DoorMat{
	int id;
	String name;
	String material;
	
	DoorMat(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	DoorMat(int id,String name,String material){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.material = material;
	}
	
	
}