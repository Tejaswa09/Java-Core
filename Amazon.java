class Amazon{
	public  String login(String email ,String password){
		String message = null;
		if (email != null && password != null)
			message = "Login successfull";
		else
			message = "Login failed";
		return message;
		
	}
	public  String login(long mobileNumber, String password){
		String message = null ;
		if(mobileNumber >6666666666L && mobileNumber<9999999999L && password != null)
			message = "Login Successfull";
		else
			message = "Login Successfull";
		return message;
	}
}