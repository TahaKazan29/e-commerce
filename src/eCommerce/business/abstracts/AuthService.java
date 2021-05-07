package eCommerce.business.abstracts;

import eCommerce.core.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(User user);
	boolean userExists(String email);
	void sendEMail(String email);
	
}
