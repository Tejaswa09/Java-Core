class Soap{
	int id;
	String name;
	String type;
	
	Soap(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Soap(int id,String name,String type){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	
}