class NoodlesRunner{
	public static void main(String args[]){
	
	Noodles packOne = new Noodles();
	packOne.code = 1;
	packOne.label = "YummyNoodles";
	packOne.taste = "Masala";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packOne.code );
	System.out.println("Label "+packOne.label );
	System.out.println("Taste "+packOne.taste );
	System.out.println();
	
	Noodles packTwo = new Noodles();
	packTwo.code = 2;
	packTwo.label = "YummyNoodles";
	packTwo.taste = "Tomato";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packTwo.code );
	System.out.println("Label "+packTwo.label );
	System.out.println("Taste "+packTwo.taste );
	System.out.println();
	
	Noodles packThree = new Noodles();
	packThree.code = 3;
	packThree.label = "YummyNoodles";
	packThree.taste = "Cheese";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packThree.code );
	System.out.println("Label "+packThree.label );
	System.out.println("Taste "+packThree.taste );
	System.out.println();
	
	Noodles packFour = new Noodles();
	packFour.code = 4;
	packFour.label = "YummyNoodles";
	packFour.taste = "Spicy";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packFour.code );
	System.out.println("Label "+packFour.label );
	System.out.println("Taste "+packFour.taste );
	System.out.println();

	Noodles packFive = new Noodles();
	packFive.code = 5;
	packFive.label = "TastyNoodles";
	packFive.taste = "Tomato";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packFive.code );
	System.out.println("Label "+packFive.label );
	System.out.println("Taste "+packFive.taste );
	System.out.println();
	
	Noodles packSix = new Noodles();
	packSix.code = 6;
	packSix.label = "Tasty Noodles";
	packSix.taste = "Chili Garlic";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packSix.code );
	System.out.println("Label "+packSix.label );
	System.out.println("Taste "+packSix.taste );
	System.out.println();
	
	Noodles packSeven = new Noodles();
	packSeven.code = 7;
	packSeven.label = "Tasty Noodles";
	packSeven.taste = "Mushroom";
	System.out.println("By no parameter constructor");
	System.out.println("Code "+packSeven.code );
	System.out.println("Label "+packSeven.label );
	System.out.println("Taste "+packSeven.taste );
	System.out.println();
	
	Noodles packOneWPC =new Noodles(1,"YummyNoodles","Masala");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packOneWPC.code );
	System.out.println("Label "+packOneWPC.label );
	System.out.println("Taste "+packOneWPC.taste );
	System.out.println();
	
	Noodles packTwoWPC =new Noodles(2,"YummyNoodles","Tomato");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packTwoWPC.code );
	System.out.println("Label "+packTwoWPC.label );
	System.out.println("Taste "+packTwoWPC.taste );
	System.out.println();
	
	Noodles packThreeWPC =new Noodles(3,"YummyNoodles","Cheese");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packThreeWPC.code );
	System.out.println("Label "+packThreeWPC.label );
	System.out.println("Taste "+packThreeWPC.taste );
	System.out.println();
	
	Noodles packFourWPC =new Noodles(4,"YummyNoodles","Spicy");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packFourWPC.code );
	System.out.println("Label "+packFourWPC.label );
	System.out.println("Taste "+packFourWPC.taste );
	System.out.println();
	
	Noodles packFiveWPC =new Noodles(5,"TastyNoodles","Chili Garlic");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packFiveWPC.code );
	System.out.println("Label "+packFiveWPC.label );
	System.out.println("Taste "+packFiveWPC.taste );
	System.out.println();
	
	Noodles packSixWPC =new Noodles(6,"Tasty Noodles","Masala");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packSixWPC.code );
	System.out.println("Label "+packSixWPC.label );
	System.out.println("Taste "+packSixWPC.taste );
	System.out.println();
	
	Noodles packSevenWPC =new Noodles(7,"TastyNoodles","Mushroom");
	System.out.println("By parameter constructor");
	System.out.println("Code "+packSevenWPC.code );
	System.out.println("Label "+packSevenWPC.label );
	System.out.println("Taste "+packSevenWPC.taste );
	System.out.println();
	
	}
}