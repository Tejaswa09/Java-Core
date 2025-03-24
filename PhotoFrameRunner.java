class PhotoFrameRunner{
	public static void main(String args[]){
	
	PhotoFrame one = new PhotoFrame();
	one.id = 1;
	one.brand = "Fujifilm";
	one.size = "4x6";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("Brand "+one.brand );
	System.out.println("Size "+one.size );
	System.out.println();
	
	PhotoFrame two = new PhotoFrame();
	two.id = 2;
	two.brand = "Canon";
	two.size = "5x7";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("Brand "+two.brand );
	System.out.println("Size "+two.size );
	System.out.println();
	
	PhotoFrame three = new PhotoFrame();
	three.id = 3;
	three.brand = "Kodak";
	three.size = "6x8";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("Brand "+three.brand );
	System.out.println("Size "+three.size );
	System.out.println();
	
	PhotoFrame four = new PhotoFrame();
	four.id = 4;
	four.brand = "Sony";
	four.size = "8x10";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("Brand "+four.brand );
	System.out.println("Size "+four.size );
	System.out.println();

	PhotoFrame five = new PhotoFrame();
	five.id = 5;
	five.brand = "Nikon";
	five.size = "10x12";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("Brand "+five.brand );
	System.out.println("Size "+five.size );
	System.out.println();
	
	PhotoFrame six = new PhotoFrame();
	six.id = 6;
	six.brand = "Polaroid";
	six.size = "12x16";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("Brand "+six.brand );
	System.out.println("Size "+six.size );
	System.out.println();
	
	PhotoFrame seven = new PhotoFrame();
	seven.id = 7;
	seven.brand = "Samsung";
	seven.size = "16x20";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("Brand "+seven.brand );
	System.out.println("Size "+seven.size );
	System.out.println();
	
	PhotoFrame oneWPC =new PhotoFrame(1,"Fujifilm","4x6");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("Brand "+oneWPC.brand );
	System.out.println("Size "+oneWPC.size );
	System.out.println();
	
	PhotoFrame twoWPC =new PhotoFrame(2,"Canon","5x7");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("Brand "+twoWPC.brand );
	System.out.println("Size "+twoWPC.size );
	System.out.println();
	
	PhotoFrame threeWPC =new PhotoFrame(3,"Kodak","6x8");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("Brand "+threeWPC.brand );
	System.out.println("Size "+threeWPC.size );
	System.out.println();
	
	PhotoFrame fourWPC =new PhotoFrame(4,"Sony","8x10");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("Brand "+fourWPC.brand );
	System.out.println("Size "+fourWPC.size );
	System.out.println();
	
	PhotoFrame fiveWPC =new PhotoFrame(5,"Nikon","10x12");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("Brand "+fiveWPC.brand );
	System.out.println("Size "+fiveWPC.size );
	System.out.println();
	
	PhotoFrame sixWPC =new PhotoFrame(6,"Polaroid","12x16");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("Brand "+sixWPC.brand );
	System.out.println("Size "+sixWPC.size );
	System.out.println();
	
	PhotoFrame sevenWPC =new PhotoFrame(7,"Samsung","16x20");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("Brand "+sevenWPC.brand );
	System.out.println("Size "+sevenWPC.size );
	System.out.println();
	}
}
