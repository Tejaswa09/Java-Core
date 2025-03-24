class SerumRunner{
	public static void main(String args[]){
	
	Serum serumOne = new Serum();
	serumOne.id = 1;
	serumOne.company = "L'Oreal";
	serumOne.forUse = "Anti-Aging";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumOne.id );
	System.out.println("Company "+serumOne.company );
	System.out.println("For Use "+serumOne.forUse );
	System.out.println();
	
	Serum serumTwo = new Serum();
	serumTwo.id = 2;
	serumTwo.company = "Olay";
	serumTwo.forUse = "Hydration";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumTwo.id );
	System.out.println("Company "+serumTwo.company );
	System.out.println("For Use "+serumTwo.forUse );
	System.out.println();
	
	Serum serumThree = new Serum();
	serumThree.id = 3;
	serumThree.company = "Neutrogena";
	serumThree.forUse = "Brightening";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumThree.id );
	System.out.println("Company "+serumThree.company );
	System.out.println("For Use "+serumThree.forUse );
	System.out.println();
	
	Serum serumFour = new Serum();
	serumFour.id = 4;
	serumFour.company = "Clinique";
	serumFour.forUse = "Wrinkle Reduction";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumFour.id );
	System.out.println("Company "+serumFour.company );
	System.out.println("For Use "+serumFour.forUse );
	System.out.println();

	Serum serumFive = new Serum();
	serumFive.id = 5;
	serumFive.company = "Estee Lauder";
	serumFive.forUse = "Firming";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumFive.id );
	System.out.println("Company "+serumFive.company );
	System.out.println("For Use "+serumFive.forUse );
	System.out.println();
	
	Serum serumSix = new Serum();
	serumSix.id = 6;
	serumSix.company = "The Ordinary";
	serumSix.forUse = "Pore Minimizing";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumSix.id );
	System.out.println("Company "+serumSix.company );
	System.out.println("For Use "+serumSix.forUse );
	System.out.println();
	
	Serum serumSeven = new Serum();
	serumSeven.id = 7;
	serumSeven.company = "Innisfree";
	serumSeven.forUse = "Hydrating";
	System.out.println("By no parameter constructor");
	System.out.println("Id "+serumSeven.id );
	System.out.println("Company "+serumSeven.company );
	System.out.println("For Use "+serumSeven.forUse );
	System.out.println();
	
	Serum serumOneWPC =new Serum(1,"L'Oreal","Anti-Aging");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumOneWPC.id );
	System.out.println("Company "+serumOneWPC.company );
	System.out.println("For Use "+serumOneWPC.forUse );
	System.out.println();
	
	Serum serumTwoWPC =new Serum(2,"Olay","Hydration");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumTwoWPC.id );
	System.out.println("Company "+serumTwoWPC.company );
	System.out.println("For Use "+serumTwoWPC.forUse );
	System.out.println();
	
	Serum serumThreeWPC =new Serum(3,"Neutrogena","Brightening");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumThreeWPC.id );
	System.out.println("Company "+serumThreeWPC.company );
	System.out.println("For Use "+serumThreeWPC.forUse );
	System.out.println();
	
	Serum serumFourWPC =new Serum(4,"Clinique","Wrinkle Reduction");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumFourWPC.id );
	System.out.println("Company "+serumFourWPC.company );
	System.out.println("For Use "+serumFourWPC.forUse );
	System.out.println();
	
	Serum serumFiveWPC =new Serum(5,"Estee Lauder","Firming");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumFiveWPC.id );
	System.out.println("Company "+serumFiveWPC.company );
	System.out.println("For Use "+serumFiveWPC.forUse );
	System.out.println();
	
	Serum serumSixWPC =new Serum(6,"The Ordinary","Pore Minimizing");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumSixWPC.id );
	System.out.println("Company "+serumSixWPC.company );
	System.out.println("For Use "+serumSixWPC.forUse );
	System.out.println();
	
	Serum serumSevenWPC =new Serum(7,"Innisfree","Hydrating");
	System.out.println("By parameter constructor");
	System.out.println("Id "+serumSevenWPC.id );
	System.out.println("Company "+serumSevenWPC.company );
	System.out.println("For Use "+serumSevenWPC.forUse );
	System.out.println();
	}
}
