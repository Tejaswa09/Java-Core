class BellRunner{
	public static void main(String args[]){
	
	Bell one = new Bell();
	one.id = 1;
	one.type = "Temple Bell";
	one.material = "Brass";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("type "+one.type );
	System.out.println("material "+one.material );
	System.out.println();
	
	Bell two = new Bell();
	two.id = 2;
	two.type = "Church Bell";
	two.material = "Bronze";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("type "+two.type );
	System.out.println("material "+two.material );
	System.out.println();
	
	Bell three = new Bell();
	three.id = 3;
	three.type = "Hand Bell";
	three.material = "Steel";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("type "+three.type );
	System.out.println("material "+three.material );
	System.out.println();
	
	Bell four = new Bell();
	four.id = 4;
	four.type = "Door Bell";
	four.material = "Electronic";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("type "+four.type );
	System.out.println("material "+four.material );
	System.out.println();

	Bell five = new Bell();
	five.id = 5;
	five.type = "Bicycle Bell";
	five.material = "Aluminum";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("type "+five.type );
	System.out.println("material "+five.material );
	System.out.println();
	
	Bell six = new Bell();
	six.id = 6;
	six.type = "School Bell";
	six.material = "Iron";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("type "+six.type );
	System.out.println("material "+six.material );
	System.out.println();
	
	Bell seven = new Bell();
	seven.id = 7;
	seven.type = "Cow Bell";
	seven.material = "Copper";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("type "+seven.type );
	System.out.println("material "+seven.material );
	System.out.println();
	
	Bell oneWPC =new Bell(1,"Temple Bell","Brass");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("type "+oneWPC.type );
	System.out.println("material "+oneWPC.material );
	System.out.println();
	
	Bell twoWPC =new Bell(2,"Church Bell","Bronze");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("type "+twoWPC.type );
	System.out.println("material "+twoWPC.material );
	System.out.println();
	
	Bell threeWPC =new Bell(3,"Hand Bell","Steel");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("type "+threeWPC.type );
	System.out.println("material "+threeWPC.material );
	System.out.println();
	
	Bell fourWPC =new Bell(4,"Door Bell","Electronic");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("type "+fourWPC.type );
	System.out.println("material "+fourWPC.material );
	System.out.println();
	
	Bell fiveWPC =new Bell(5,"Bicycle Bell","Aluminum");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("type "+fiveWPC.type );
	System.out.println("material "+fiveWPC.material );
	System.out.println();
	
	Bell sixWPC =new Bell(6,"School Bell","Iron");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("type "+sixWPC.type );
	System.out.println("material "+sixWPC.material );
	System.out.println();
	
	Bell sevenWPC =new Bell(7,"Cow Bell","Copper");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("type "+sevenWPC.type );
	System.out.println("material "+sevenWPC.material );
	System.out.println();
	
	}
}
 