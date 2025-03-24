class Bell{
	int id;
	String type;
	String material;
	
	Bell(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Bell(int id,String type,String material){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.type = type;
		this.material = material;
	}
	
	
}