package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.core.entities.concretes.User;

public interface UserService {

	void add(User user);
	List<User> getAll();
	User getByMail(String email);
	
}
