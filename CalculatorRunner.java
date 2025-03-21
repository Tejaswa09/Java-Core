class CalculatorRunner{
	public static void main(String args[]){
		int firstNumber = 121;
		int secondNumber = 60;
		System.out.println("The addition of "+firstNumber+" and "+secondNumber+" is "+Calculator.add(firstNumber,secondNumber));
		System.out.println("The subtraction of "+firstNumber+" and "+secondNumber+" is "+Calculator.subtraction(firstNumber,secondNumber));
		System.out.println("The multiplication of "+firstNumber+" and "+secondNumber+" is "+Calculator.multiplication(firstNumber,secondNumber));
		System.out.println("The division of "+firstNumber+" and "+secondNumber+" is "+Calculator.division(firstNumber,secondNumber));
		System.out.println("The modulus of "+firstNumber+" and "+secondNumber+" is "+Calculator.modulus(firstNumber,secondNumber));
	}
}