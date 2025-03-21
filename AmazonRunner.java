class AmazonRunner{
	public static void main(String args[]){
		String firstName = "Tejaswa";
		String lastName = "D";
		String mobileNumber = "7899455818" ;
		String gender = "Male" ;
		String dob = "29/09/2003";
		String emailId = "tejaswad18@gmail.com";
		
		Amazon.signUp(firstName,lastName,mobileNumber,gender,dob,emailId);
		
	}
}