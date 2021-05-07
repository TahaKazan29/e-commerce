package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.entities.concretes.User;
import eCommerce.dataAccess.abstracts.UserDao;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		//business code
		userDao.add(user);
	}

	@Override
	public User getByMail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	
	
}
