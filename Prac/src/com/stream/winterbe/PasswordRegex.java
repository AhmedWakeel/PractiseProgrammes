package com.stream.winterbe;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class PasswordRegex{
	
	  private Pattern pattern;
	  private Matcher matcher;
 
	  private static final String PASSWORD_PATTERN = 
//              "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}$";
			  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[~!()*@#$%/^&{}+=])(?=\\S+$).{10,}$";
//	  *@!#%&()^~{}	        
	  public PasswordRegex(){
		  pattern = Pattern.compile(PASSWORD_PATTERN);
	  }
	  public boolean validate(final String password){
		  
		  matcher = pattern.matcher(password);
		  return matcher.matches();
	  }
	  public static void main(String[] args) {
		
		  boolean validate = new PasswordRegex().validate("1KAawDdD-aa");
		  System.out.println(validate);
		  
	}
}