package eCommerce.dataAccess.abstracts;

import java.util.List;

import eCommerce.core.entities.concretes.User;


public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User getByEmail(String email);
	List<User> getAll();
	
}
