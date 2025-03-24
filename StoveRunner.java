class StoveRunner{
	public static void main(String args[]){
	
	Stove one = new Stove();
	one.id = 1;
	one.name = "Prestige";
	one.type = "Gas";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("type "+one.type );
	System.out.println();
	
	Stove two = new Stove();
	two.id = 2;
	two.name = "Prestige";
	two.type = "Electric";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("type "+two.type );
	System.out.println();
	
	Stove three = new Stove();
	three.id = 3;
	three.name = "Prestige";
	three.type = "Induction";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("type "+three.type );
	System.out.println();
	
	Stove four = new Stove();
	four.id = 4;
	four.name = "Prestige";
	four.type = "Wood Stove";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("type "+four.type );
	System.out.println();

	Stove five = new Stove();
	five.id = 5;
	five.name = "Butterfly";
	five.type = "Electric";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("type "+five.type );
	System.out.println();
	
	Stove six = new Stove();
	six.id = 6;
	six.name = "Butterfly";
	six.type = "Solar Stove";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("type "+six.type );
	System.out.println();
	
	Stove seven = new Stove();
	seven.id = 7;
	seven.name = "Butterfly";
	seven.type = "Charcoal Stove";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("type "+seven.type );
	System.out.println();
	
	Stove oneWPC =new Stove(1,"Prestige","Gas");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("type "+oneWPC.type );
	System.out.println();
	
	Stove twoWPC =new Stove(2,"Prestige","Electric");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("type "+twoWPC.type );
	System.out.println();
	
	Stove threeWPC =new Stove(3,"Prestige","Electric");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("type "+threeWPC.type );
	System.out.println();
	
	Stove fourWPC =new Stove(1,"Prestige","Gas");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("type "+fourWPC.type );
	System.out.println();
	
	Stove fiveWPC =new Stove(5,"Prestige","Solar Stove");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("type "+fiveWPC.type );
	System.out.println();
	
	Stove sixWPC =new Stove(6,"Butterfly","Gas");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("type "+sixWPC.type );
	System.out.println();
	
	Stove sevenWPC =new Stove(7,"Butterfly","Gas");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("type "+sevenWPC.type );
	System.out.println();
	
	}
}
