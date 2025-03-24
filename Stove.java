class Stove{
	int id;
	String name;
	String type;
	
	Stove(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Stove(int id,String name,String type){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	
}