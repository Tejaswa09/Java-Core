class BankAccount{
	static double balance;
	public static void credit(double amount){
		System.out.println("Starting of credit");
		if(amount>0.0)
			balance = balance +amount;
		else
			System.out.println("Enter the valid amount");
		System.out.println("Ending of credit");
		System.out.println();
	}
	public static void debit(double amount){
		System.out.println("Starting of deposit");
		if (balance>=amount)
			balance -= amount;
		else
			System.out.println("Insufficiant balance");
		System.out.println("ending of  deposit");
		System.out.println();
	}
	public static void getBalance(){
		System.out.println(balance);
	}
	
	
}