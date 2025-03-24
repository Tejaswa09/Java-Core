class TubeLightRunner{
	public static void main(String args[]){
	
	TubeLight lightOne = new TubeLight();
	lightOne.id = 1;
	lightOne.company = "Philips";
	lightOne.powerConsume = "20W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightOne.id );
	System.out.println("Company "+lightOne.company );
	System.out.println("Power Consumption "+lightOne.powerConsume );
	System.out.println();
	
	TubeLight lightTwo = new TubeLight();
	lightTwo.id = 2;
	lightTwo.company = "Syska";
	lightTwo.powerConsume = "18W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightTwo.id );
	System.out.println("Company "+lightTwo.company );
	System.out.println("Power Consumption "+lightTwo.powerConsume );
	System.out.println();
	
	TubeLight lightThree = new TubeLight();
	lightThree.id = 3;
	lightThree.company = "Havells";
	lightThree.powerConsume = "22W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightThree.id );
	System.out.println("Company "+lightThree.company );
	System.out.println("Power Consumption "+lightThree.powerConsume );
	System.out.println();
	
	TubeLight lightFour = new TubeLight();
	lightFour.id = 4;
	lightFour.company = "Wipro";
	lightFour.powerConsume = "25W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightFour.id );
	System.out.println("Company "+lightFour.company );
	System.out.println("Power Consumption "+lightFour.powerConsume );
	System.out.println();

	TubeLight lightFive = new TubeLight();
	lightFive.id = 5;
	lightFive.company = "Eveready";
	lightFive.powerConsume = "15W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightFive.id );
	System.out.println("Company "+lightFive.company );
	System.out.println("Power Consumption "+lightFive.powerConsume );
	System.out.println();
	
	TubeLight lightSix = new TubeLight();
	lightSix.id = 6;
	lightSix.company = "Bajaj";
	lightSix.powerConsume = "19W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightSix.id );
	System.out.println("Company "+lightSix.company );
	System.out.println("Power Consumption "+lightSix.powerConsume );
	System.out.println();
	
	TubeLight lightSeven = new TubeLight();
	lightSeven.id = 7;
	lightSeven.company = "Crompton";
	lightSeven.powerConsume = "21W";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+lightSeven.id );
	System.out.println("Company "+lightSeven.company );
	System.out.println("Power Consumption "+lightSeven.powerConsume );
	System.out.println();
	
	TubeLight lightOneWPC =new TubeLight(1,"Philips","20W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightOneWPC.id );
	System.out.println("Company "+lightOneWPC.company );
	System.out.println("Power Consumption "+lightOneWPC.powerConsume );
	System.out.println();
	
	TubeLight lightTwoWPC =new TubeLight(2,"Syska","18W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightTwoWPC.id );
	System.out.println("Company "+lightTwoWPC.company );
	System.out.println("Power Consumption "+lightTwoWPC.powerConsume );
	System.out.println();
	
	TubeLight lightThreeWPC =new TubeLight(3,"Havells","22W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightThreeWPC.id );
	System.out.println("Company "+lightThreeWPC.company );
	System.out.println("Power Consumption "+lightThreeWPC.powerConsume );
	System.out.println();
	
	TubeLight lightFourWPC =new TubeLight(4,"Wipro","25W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightFourWPC.id );
	System.out.println("Company "+lightFourWPC.company );
	System.out.println("Power Consumption "+lightFourWPC.powerConsume );
	System.out.println();
	
	TubeLight lightFiveWPC =new TubeLight(5,"Eveready","15W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightFiveWPC.id );
	System.out.println("Company "+lightFiveWPC.company );
	System.out.println("Power Consumption "+lightFiveWPC.powerConsume );
	System.out.println();
	
	TubeLight lightSixWPC =new TubeLight(6,"Bajaj","19W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightSixWPC.id );
	System.out.println("Company "+lightSixWPC.company );
	System.out.println("Power Consumption "+lightSixWPC.powerConsume );
	System.out.println();
	
	TubeLight lightSevenWPC =new TubeLight(7,"Crompton","21W");
	System.out.println("By parameter constructor");
	System.out.println("Id "+lightSevenWPC.id );
	System.out.println("Company "+lightSevenWPC.company );
	System.out.println("Power Consumption "+lightSevenWPC.powerConsume );
	System.out.println();
	
	}
}
