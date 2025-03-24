class Vase{
	int id;
	String name;
	String material;
	
	Vase(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Vase(int id,String name,String material){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.material = material;
	}
	
	
}