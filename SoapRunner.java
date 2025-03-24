class SoapRunner{
	public static void main(String args[]){
	
	Soap one = new Soap();
	one.id = 1;
	one.name = "Dove";
	one.type = "Moisturizing";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("type "+one.type );
	System.out.println();
	
	Soap two = new Soap();
	two.id = 2;
	two.name = "Dove";
	two.type = "Sensitive Skin";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("type "+two.type );
	System.out.println();
	
	Soap three = new Soap();
	three.id = 3;
	three.name = "Dove";
	three.type = "Exfoliating";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("type "+three.type );
	System.out.println();
	
	Soap four = new Soap();
	four.id = 4;
	four.name = "Dove";
	four.type = "Cooling";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("type "+four.type );
	System.out.println();

	Soap five = new Soap();
	five.id = 5;
	five.name = "Lux";
	five.type = "Floral Beauty";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("type "+five.type );
	System.out.println();
	
	Soap six = new Soap();
	six.id = 6;
	six.name = "Lux";
	six.type = "Velvet Touch";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("type "+six.type );
	System.out.println();
	
	Soap seven = new Soap();
	seven.id = 7;
	seven.name = "Lux";
	seven.type = "Aqua Sparkle";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("type "+seven.type );
	System.out.println();
	
	Soap oneWPC =new Soap(1,"Dove","Moisturizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("type "+oneWPC.type );
	System.out.println();
	
	Soap twoWPC =new Soap(2,"Dove","Sensitive Skin");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("type "+twoWPC.type );
	System.out.println();
	
	Soap threeWPC =new Soap(3,"Dove","Exfoliating");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("type "+threeWPC.type );
	System.out.println();
	
	Soap fourWPC =new Soap(4,"Dove","Cooling");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("type "+fourWPC.type );
	System.out.println();
	
	Soap fiveWPC =new Soap(5,"Lux","Floral Beauty");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("type "+fiveWPC.type );
	System.out.println();
	
	Soap sixWPC =new Soap(6,"Lux","Velvet Touch");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("type "+sixWPC.type );
	System.out.println();
	
	Soap sevenWPC =new Soap(7,"Lux","Aqua Sparkle");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("type "+sevenWPC.type );
	System.out.println();
	
	}
}
