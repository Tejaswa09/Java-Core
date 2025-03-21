class Amazon{
	public static void signUp(String firstName , String lastName, String mobileNumber , String gender, String dob, String emailId){
		boolean validated = false ;
		validated=validateUser(firstName,lastName,mobileNumber,gender,dob,emailId);
		if (validated == true){
			System.out.println("User sign up succesfully");
		}else{
			System.out.println("Error");
		}
	}
	public static boolean validateUser(String firstName,String lastName,String mobileNumber, String gender,String dob , String emailId){
		boolean userValidate = false;
		boolean isfirstNameValid = false ;
		boolean islastNameValid = false ;
		boolean ismobileNumberValid = false ;
		boolean isgenderValid = false ;
		boolean isdobValid = false ;
		boolean isemailIdValid = false ;
		 
		if(firstName.length() >= 1 && firstName != null){
			isfirstNameValid = true;
						
		}else{
			System.out.println("First name is invalid.. please provide valid name");	
		}
		
		if(lastName.length() >= 1 && lastName != null){
			islastNameValid = true ;
			
		}else{
			System.out.println("Last name is invalid.. please provide valid last Name");
		}
		
		if(mobileNumber.length() ==10 && mobileNumber != null){
			ismobileNumberValid = true ;
			
		}else{
			System.out.println("Mobile number is invalid.. please provide valid mobile number");
		}
		
		if(gender != null ){
			isgenderValid = true ;
			
			
		}else{
			System.out.println("Gender is invalid .. please provide Valid input");
		}
		
		if(dob != null){
			isdobValid = true;
		}else{
			System.out.println("invalid input .. please provode valid input");
		}
		
		if(emailId != null){
			isemailIdValid = true;			
		}else{
			System.out.println("invalid input .. please provode valid input");
		}
		
		if(isfirstNameValid == true && islastNameValid == true && isgenderValid == true && isemailIdValid == true && isdobValid == true && isemailIdValid == true){
			userValidate = true;
			
		}else{
			userValidate = false ;
			
		}
		
		return userValidate ;
	}
}