class Instagram{
	public static String login(String username,String password,char u){
		String message = null;
		if (username.length()>4 && username != null && password != null)
			message = "Login successfull";
		else 
			message = "Lagin failed ";
		return message;
		
	}
	public static String login(String email,String password){
		String message = null;
		if(email.length()>4 && email != null && password != null)
			message = "Login successfull";
		else 
			message = "Login failed";
		return message;
	}
	
	public static String login(long mobileNumber, String password ){
		String message = null;
		if (mobileNumber >6000000000L && mobileNumber <9999999999L)
			message = "Login successfull";
		else 
			message = "Login failed";
		return message;
	}
}