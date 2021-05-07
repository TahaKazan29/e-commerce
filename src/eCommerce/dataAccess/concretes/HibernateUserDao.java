package eCommerce.dataAccess.concretes;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import eCommerce.business.constants.Messages;
import eCommerce.core.entities.concretes.User;
import eCommerce.dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao {

	private ArrayList<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

}
