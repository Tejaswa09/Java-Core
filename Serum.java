class Serum{
	int id;
	String company;
	String forUse;
	
	Serum(){
		System.out.println("No parameter Constructor is invoked");
	}
	
	Serum(int id,String company,String forUse){
		System.out.println("Parameter Constructor is invoked");
		this.id = id;
		this.company = company;
		this.forUse = forUse;
	}
	
	
}