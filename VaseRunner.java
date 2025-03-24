class VaseRunner{
	public static void main(String args[]){
	
	Vase one = new Vase();
	one.id = 1;
	one.name = "Elegant";
	one.material = "Ceramic";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("material "+one.material );
	System.out.println();
	
	Vase two = new Vase();
	two.id = 2;
	two.name = "Classic";
	two.material = "Glass";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("material "+two.material );
	System.out.println();
	
	Vase three = new Vase();
	three.id = 3;
	three.name = "Royal";
	three.material = "Porcelain";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("material "+three.material );
	System.out.println();
	
	Vase four = new Vase();
	four.id = 4;
	four.name = "Modern";
	four.material = "Metal";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("material "+four.material );
	System.out.println();

	Vase five = new Vase();
	five.id = 5;
	five.name = "Vintage";
	five.material = "Wood";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("material "+five.material );
	System.out.println();
	
	Vase six = new Vase();
	six.id = 6;
	six.name = "Ornate";
	six.material = "Clay";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("material "+six.material );
	System.out.println();
	
	Vase seven = new Vase();
	seven.id = 7;
	seven.name = "Luxury";
	seven.material = "Crystal";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("material "+seven.material );
	System.out.println();
	
	Vase oneWPC =new Vase(1,"Elegant","Ceramic");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("material "+oneWPC.material );
	System.out.println();
	
	Vase twoWPC =new Vase(2,"Classic","Glass");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("material "+twoWPC.material );
	System.out.println();
	
	Vase threeWPC =new Vase(3,"Royal","Porcelain");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("material "+threeWPC.material );
	System.out.println();
	
	Vase fourWPC =new Vase(4,"Modern","Metal");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("material "+fourWPC.material );
	System.out.println();
	
	Vase fiveWPC =new Vase(5,"Vintage","Wood");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("material "+fiveWPC.material );
	System.out.println();
	
	Vase sixWPC =new Vase(6,"Ornate","Clay");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("material "+sixWPC.material );
	System.out.println();
	
	Vase sevenWPC =new Vase(7,"Luxury","Crystal");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("material "+sevenWPC.material );
	System.out.println();
	
	}
}
