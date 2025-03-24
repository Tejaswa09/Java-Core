class CarryBagRunner{
	public static void main(String args[]){
	
	CarryBag one = new CarryBag();
	one.id = 1;
	one.brand = "EcoCarry";
	one.material = "Cotton";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("Brand "+one.brand );
	System.out.println("Material "+one.material );
	System.out.println();
	
	CarryBag two = new CarryBag();
	two.id = 2;
	two.brand = "EcoCarry";
	two.material = "Jute";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("Brand "+two.brand );
	System.out.println("Material "+two.material );
	System.out.println();
	
	CarryBag three = new CarryBag();
	three.id = 3;
	three.brand = "EcoCarry";
	three.material = "Canvas";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("Brand "+three.brand );
	System.out.println("Material "+three.material );
	System.out.println();
	
	CarryBag four = new CarryBag();
	four.id = 4;
	four.brand = "EcoCarry";
	four.material = "Polyester";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("Brand "+four.brand );
	System.out.println("Material "+four.material );
	System.out.println();

	CarryBag five = new CarryBag();
	five.id = 5;
	five.brand = "GreenBag";
	five.material = "Jute";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("Brand "+five.brand );
	System.out.println("Material "+five.material );
	System.out.println();
	
	CarryBag six = new CarryBag();
	six.id = 6;
	six.brand = "Green Bag";
	six.material = "Recycled Plastic";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("Brand "+six.brand );
	System.out.println("Material "+six.material );
	System.out.println();
	
	CarryBag seven = new CarryBag();
	seven.id = 7;
	seven.brand = "Green Bag";
	seven.material = "Paper";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("Brand "+seven.brand );
	System.out.println("Material "+seven.material );
	System.out.println();
	
	CarryBag oneWPC =new CarryBag(1,"EcoCarry","Cotton");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("Brand "+oneWPC.brand );
	System.out.println("Material "+oneWPC.material );
	System.out.println();
	
	CarryBag twoWPC =new CarryBag(2,"EcoCarry","Jute");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("Brand "+twoWPC.brand );
	System.out.println("Material "+twoWPC.material );
	System.out.println();
	
	CarryBag threeWPC =new CarryBag(3,"EcoCarry","Canvas");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("Brand "+threeWPC.brand );
	System.out.println("Material "+threeWPC.material );
	System.out.println();
	
	CarryBag fourWPC =new CarryBag(4,"EcoCarry","Polyester");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("Brand "+fourWPC.brand );
	System.out.println("Material "+fourWPC.material );
	System.out.println();
	
	CarryBag fiveWPC =new CarryBag(5,"GreenBag","Recycled Plastic");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("Brand "+fiveWPC.brand );
	System.out.println("Material "+fiveWPC.material );
	System.out.println();
	
	CarryBag sixWPC =new CarryBag(6,"Green Bag","Cotton");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("Brand "+sixWPC.brand );
	System.out.println("Material "+sixWPC.material );
	System.out.println();
	
	CarryBag sevenWPC =new CarryBag(7,"GreenBag","Paper");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("Brand "+sevenWPC.brand );
	System.out.println("Material "+sevenWPC.material );
	System.out.println();
	
	}
}
