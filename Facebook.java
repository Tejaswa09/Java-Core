class Facebook{
	public static String login(String email,String password){
		String message = null;
		if (email != null && email.length()>1)
			message = "Login successfull";
		else
			message = "Either password or email is invalid";
		return message;
	}
	public static String login(long number, String password){
		String message= null;
		if (number >6000000000L && number <9999999999L)
			message = "loging successfull";
		else
			message = "Either number or password is invalllid";
		return message;
	}
}