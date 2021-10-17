package regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	
	void validateEmail(String email) {// validating emails 
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+(com)+)$";
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(email);  
        System.out.println(email +" : "+ matcher.matches());  
        System.out.println();
	}
	
	void validatePhone(String phone) {// validating phone numbers 
		
		String regex = "^\\+91\\d{9}$";
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(phone);  
        System.out.println(phone +" : "+ matcher.matches());  
        System.out.println();
	}
	
	void validatePassword(String password) {// validating passwords
		
		String regex = "^(?=.*[A-Z])"
				+ "(?=.*[0-9]{3})"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=\\S+$).{10}$";
		Pattern pattern = Pattern.compile(regex); 
		Matcher matcher = pattern.matcher(password);  
        System.out.println(password +" : "+ matcher.matches());  
        System.out.println();
	}

	public static void main(String[] args) {
		
		// create an object
		RegEx r = new RegEx();
		
		ArrayList<String> emails = new ArrayList<String>();  
		
			emails.add("firstname@gmail.com");
			emails.add("payam@gmail.com");
			emails.add("test@co.edu");
				
			for(String email : emails){    		
				r.validateEmail(email);
			}  
		
			String phone1 = "+91878763342";
			String phone2 = "+19878763342";
				
			r.validatePhone(phone1);
			r.validatePhone(phone2);
				
			String PW1 = "Esugdt231e";
			String PW2 = "esugdt2311";
		
			r.validatePassword(PW1);
			r.validatePassword(PW2);

	}

}
