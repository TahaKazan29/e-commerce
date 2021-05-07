package eCommerce;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.adapter.GoogleManagerAdapter;
import eCommerce.core.entities.concretes.User;
import eCommerce.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Taha","Kazan","tahakazantk@gmail.com","tahaaa");
		
		HibernateUserDao userDao = new HibernateUserDao();
		UserManager userManager = new UserManager(userDao);
		GoogleManagerAdapter googleManagerAdapter = new GoogleManagerAdapter(userManager);
		AuthService authService = new AuthManager(userManager);
		
		// Google ile 
		//googleManagerAdapter.register(user);
		//googleManagerAdapter.login(user);
		
		//Auth ile
		authService.register(user);
		//authService.login(user);
		
        System.out.println("----- Kayýtlý Kullanýcýlar -----");
		for (User userr : userManager.getAll()) {
			System.out.println(userr.getName() +" "+userr.getLastName());
		}

	}

}
