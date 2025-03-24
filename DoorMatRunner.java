class DoorMatRunner{
	public static void main(String args[]){
	
	DoorMat one = new DoorMat();
	one.id = 1;
	one.name = "CozyMat";
	one.material = "Cotton";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+one.id );
	System.out.println("name "+one.name );
	System.out.println("material "+one.material );
	System.out.println();
	
	DoorMat two = new DoorMat();
	two.id = 2;
	two.name = "SoftStep";
	two.material = "Polyester";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+two.id );
	System.out.println("name "+two.name );
	System.out.println("material "+two.material );
	System.out.println();
	
	DoorMat three = new DoorMat();
	three.id = 3;
	three.name = "FirmGrip";
	three.material = "Rubber";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+three.id );
	System.out.println("name "+three.name );
	System.out.println("material "+three.material );
	System.out.println();
	
	DoorMat four = new DoorMat();
	four.id = 4;
	four.name = "ComfortMat";
	four.material = "Foam";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+four.id );
	System.out.println("name "+four.name );
	System.out.println("material "+four.material );
	System.out.println();

	DoorMat five = new DoorMat();
	five.id = 5;
	five.name = "GripSafe";
	five.material = "Jute";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+five.id );
	System.out.println("name "+five.name );
	System.out.println("material "+five.material );
	System.out.println();
	
	DoorMat six = new DoorMat();
	six.id = 6;
	six.name = "StepEase";
	six.material = "Nylon";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+six.id );
	System.out.println("name "+six.name );
	System.out.println("material "+six.material );
	System.out.println();
	
	DoorMat seven = new DoorMat();
	seven.id = 7;
	seven.name = "DurableMat";
	seven.material = "PVC";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+seven.id );
	System.out.println("name "+seven.name );
	System.out.println("material "+seven.material );
	System.out.println();
	
	DoorMat oneWPC =new DoorMat(1,"CozyMat","Cotton");
	System.out.println("By parameter constructor");
	System.out.println("Id "+oneWPC.id );
	System.out.println("name "+oneWPC.name );
	System.out.println("material "+oneWPC.material );
	System.out.println();
	
	DoorMat twoWPC =new DoorMat(2,"SoftStep","Polyester");
	System.out.println("By parameter constructor");
	System.out.println("Id "+twoWPC.id );
	System.out.println("name "+twoWPC.name );
	System.out.println("material "+twoWPC.material );
	System.out.println();
	
	DoorMat threeWPC =new DoorMat(3,"FirmGrip","Rubber");
	System.out.println("By parameter constructor");
	System.out.println("Id "+threeWPC.id );
	System.out.println("name "+threeWPC.name );
	System.out.println("material "+threeWPC.material );
	System.out.println();
	
	DoorMat fourWPC =new DoorMat(4,"ComfortMat","Foam");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fourWPC.id );
	System.out.println("name "+fourWPC.name );
	System.out.println("material "+fourWPC.material );
	System.out.println();
	
	DoorMat fiveWPC =new DoorMat(5,"GripSafe","Jute");
	System.out.println("By parameter constructor");
	System.out.println("Id "+fiveWPC.id );
	System.out.println("name "+fiveWPC.name );
	System.out.println("material "+fiveWPC.material );
	System.out.println();
	
	DoorMat sixWPC =new DoorMat(6,"StepEase","Nylon");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sixWPC.id );
	System.out.println("name "+sixWPC.name );
	System.out.println("material "+sixWPC.material );
	System.out.println();
	
	DoorMat sevenWPC =new DoorMat(7,"DurableMat","PVC");
	System.out.println("By parameter constructor");
	System.out.println("Id "+sevenWPC.id );
	System.out.println("name "+sevenWPC.name );
	System.out.println("material "+sevenWPC.material );
	System.out.println();
	
	}
}
