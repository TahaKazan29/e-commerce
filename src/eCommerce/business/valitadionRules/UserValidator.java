package eCommerce.business.valitadionRules;

import eCommerce.business.constants.Messages;

public class UserValidator {

	public static boolean checkPassword(String password) {
		if(password.length() < 6) {
			Messages.checkPassword();
			return false;
		}
		return true;
	}
	
	public static boolean checkName(String name) {
		if(name.length() < 2) {
			Messages.checkName();
			return false;
		}
		return true;
	}
	
	public static boolean checkLastName(String lastName) {
		if(lastName.length() < 2) {
			Messages.checkLastName();;
			return false;
		}
		return true;
	}
	
}
