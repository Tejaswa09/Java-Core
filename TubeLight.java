class TubeLight{
	int id;
	String company;
	String powerConsume;
	
	TubeLight(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	TubeLight(int id,String company,String powerConsume){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.company = company;
		this.powerConsume = powerConsume;
	}
	
	
}