package eCommerce.google;

import eCommerce.business.constants.Messages;
import eCommerce.core.entities.concretes.User;

public class GoogleManager {

	public void register(User user) {
		Messages.registerWithGoogle(user.getName());
	}
	
	public void login(User user) {
		Messages.loginWithGoogle(user.getName());
	}
	
}
