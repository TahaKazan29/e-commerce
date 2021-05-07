package eCommerce.business.concretes;

import java.util.Scanner;
import java.util.UUID;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.constants.Messages;
import eCommerce.business.valitadionRules.UserValidator;
import eCommerce.core.entities.concretes.User;
import eCommerce.core.utilities.business.BusinessRules;
import eCommerce.core.utilities.regex.EmailRegex;

public class AuthManager implements AuthService {
	
	private UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	public void register(User user) {
		
		boolean result = BusinessRules.run(userExists(user.getEmail()),UserValidator.checkPassword(user.getPassword())
				,UserValidator.checkName(user.getName()),UserValidator.checkLastName(user.getLastName()),
				EmailRegex.regex(user.getEmail()));
		
		if(result) {
				this.sendEMail(user.getEmail());
				if(clickOnTheLink()) {
					var newUser = new User(user.getId(),user.getName(),user.getLastName(),user.getEmail(),user.getPassword());
					userService.add(newUser);
					Messages.userRegister(user.getName());
				}
		}			
	}

	@Override
	public void login(User user) {
		
		var userToCheck = userService.getByMail(user.getEmail());
		if(userToCheck == null) {
			Messages.userNotFound();
		}
		else if (userToCheck.getPassword() == user.getPassword()) {
			Messages.userLogin(user.getName());
		}
		else {
			Messages.wrongPassword();
		}
	}

	@Override
	public boolean userExists(String email) {
		if(userService.getByMail(email) != null) {
			Messages.userAlreadyExists();
			return false;
		}
		return true;
	}
	
	@Override
	public void sendEMail(String email) {
		Messages.sendEmail(email);
	}
	
	public void randomEmailCodeGenerator() {
			String uuid = UUID.randomUUID().toString();
			Messages.sendEmailCode(uuid);
	}
	
	public boolean clickOnTheLink() {
		var scanner = new Scanner(System.in);
		Messages.clickOnTheLink();
		String message = scanner.nextLine();
		if(message.equals("y") || message.equals("Y")) {
			this.randomEmailCodeGenerator();
			return true;
		}
		else {
			Messages.verificationFailed();
			return false;
		}
	}
	
	
	
	
}
