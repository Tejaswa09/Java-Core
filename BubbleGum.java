class BubbleGum{
	int id;
	String name;
	String flavour;
	
	BubbleGum(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	BubbleGum(int id,String name,String flavour){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.name = name;
		this.flavour = flavour;
	}
	
	
}