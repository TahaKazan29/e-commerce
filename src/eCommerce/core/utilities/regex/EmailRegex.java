package eCommerce.core.utilities.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.business.constants.Messages;

public class EmailRegex {

	public static boolean regex(String email) {    
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.find() == false)
		{
			Messages.checkEmailRegex();
			return false;
		}
		else {
			return true;
		}
		
	}
	
}
