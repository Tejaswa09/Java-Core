class ShampooRunner{
	public static void main(String args[]){
	
	Shampoo one = new Shampoo();
	one.id = 1;
	one.name = "Dove";
	one.type = "Moisturizing";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("type "+one.type );
	System.out.println();
	
	Shampoo two = new Shampoo();
	two.id = 2;
	two.name = "Dove";
	two.type = "Anti-Dandruff";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("type "+two.type );
	System.out.println();
	
	Shampoo three = new Shampoo();
	three.id = 3;
	three.name = "Dove";
	three.type = "Herbal";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("type "+three.type );
	System.out.println();
	
	Shampoo four = new Shampoo();
	four.id = 4;
	four.name = "Dove";
	four.type = "Keratin Smooth";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("type "+four.type );
	System.out.println();

	Shampoo five = new Shampoo();
	five.id = 5;
	five.name = "Pantene";
	five.type = "Anti-Hair Fall";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("type "+five.type );
	System.out.println();
	
	Shampoo six = new Shampoo();
	six.id = 6;
	six.name = "Pantene";
	six.type = "Silky Smooth";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("type "+six.type );
	System.out.println();
	
	Shampoo seven = new Shampoo();
	seven.id = 7;
	seven.name = "Pantene";
	seven.type = "Volume Boost";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("type "+seven.type );
	System.out.println();
	
	Shampoo oneWPC =new Shampoo(1,"Dove","Moisturizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("type "+oneWPC.type );
	System.out.println();
	
	Shampoo twoWPC =new Shampoo(2,"Dove","Anti-Dandruff");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("type "+twoWPC.type );
	System.out.println();
	
	Shampoo threeWPC =new Shampoo(3,"Dove","Anti-Dandruff");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("type "+threeWPC.type );
	System.out.println();
	
	Shampoo fourWPC =new Shampoo(1,"Dove","Moisturizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("type "+fourWPC.type );
	System.out.println();
	
	Shampoo fiveWPC =new Shampoo(5,"Dove","Silky Smooth");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("type "+fiveWPC.type );
	System.out.println();
	
	Shampoo sixWPC =new Shampoo(6,"Pantene","Moisturizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("type "+sixWPC.type );
	System.out.println();
	
	Shampoo sevenWPC =new Shampoo(7,"Pantene","Moisturizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("type "+sevenWPC.type );
	System.out.println();
	
	}
}
