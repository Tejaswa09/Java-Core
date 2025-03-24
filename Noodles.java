class Noodles{
	int code;
	String label;
	String taste;
	
	Noodles(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Noodles(int code,String label,String taste){
		System.out.println("Parameter Constructor is invoked");
		this.code = code;
		this.label = label;
		this.taste = taste;
	}
	
	
}