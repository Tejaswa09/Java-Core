class Shampoo{
	int id;
	String name;
	String type;
	
	Shampoo(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Shampoo(int id,String name,String type){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	
}