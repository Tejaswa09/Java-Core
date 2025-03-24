class BubbleGumRunner{
	public static void main(String args[]){
	
	BubbleGum one = new BubbleGum();
	one.id = 1;
	one.name = "Boomer";
	one.flavour = "Strawberry";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("flavour "+one.flavour );
	System.out.println();
	
	BubbleGum two = new BubbleGum();
	two.id = 2;
	two.name = "Boomer";
	two.flavour = "Blue Berry";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("flavour "+two.flavour );
	System.out.println();
	
	BubbleGum three = new BubbleGum();
	three.id = 3;
	three.name = "Boomer";
	three.flavour = "choclate";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("flavour "+three.flavour );
	System.out.println();
	
	BubbleGum four = new BubbleGum();
	four.id = 4;
	four.name = "Boomer";
	four.flavour = "orange";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("flavour "+four.flavour );
	System.out.println();

	BubbleGum five = new BubbleGum();
	five.id = 5;
	five.name = "SweetBurst";
	five.flavour = "Blue Berry";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("flavour "+five.flavour );
	System.out.println();
	
	BubbleGum six = new BubbleGum();
	six.id = 6;
	six.name = "Sweet Burst";
	six.flavour = "cotton candy";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("flavour "+six.flavour );
	System.out.println();
	
	BubbleGum seven = new BubbleGum();
	seven.id = 7;
	seven.name = "Sweet Burst";
	seven.flavour = "hajmula";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("flavour "+seven.flavour );
	System.out.println();
	
	BubbleGum oneWPC =new BubbleGum(1,"Boomer","Strawberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("flavour "+oneWPC.flavour );
	System.out.println();
	
	BubbleGum twoWPC =new BubbleGum(2,"Boomer","Blueberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("flavour "+twoWPC.flavour );
	System.out.println();
	
	BubbleGum threeWPC =new BubbleGum(3,"Boomer","blueberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("flavour "+threeWPC.flavour );
	System.out.println();
	
	BubbleGum fourWPC =new BubbleGum(1,"Boomer","Strawberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("flavour "+fourWPC.flavour );
	System.out.println();
	
	BubbleGum fiveWPC =new BubbleGum(5,"Boomer","cottton candy");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("flavour "+fiveWPC.flavour );
	System.out.println();
	
	BubbleGum sixWPC =new BubbleGum(6,"SWeet Burst","Strawberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("flavour "+sixWPC.flavour );
	System.out.println();
	
	BubbleGum sevenWPC =new BubbleGum(7,"SweetBurst","Strawberry");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("flavour "+sevenWPC.flavour );
	System.out.println();
	
	
	
	}

}