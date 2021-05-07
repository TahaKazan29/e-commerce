package eCommerce.core.adapter;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.entities.concretes.User;
import eCommerce.google.GoogleManager;

public class GoogleManagerAdapter implements AuthService {

	private GoogleManager googleManager = new GoogleManager();
	private UserService userService;
	
	
	public GoogleManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		userService.add(user);
		googleManager.register(user);
	}

	@Override
	public void login(User user) {
		googleManager.login(user);
	}

	@Override
	public boolean userExists(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sendEMail(String email) {
		// TODO Auto-generated method stub
		
	}
}
