package designpattern.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Optional;

public class Server {

	private HashMap<String, User> users = new HashMap<>();
	
	private Validator validator;
	
	public Server() {
		
	}
	
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	
	public boolean login(User user) {
		if(validator.check(user)) {
			System.out.println("Authentication completed ..... ");
			return true;
		}
		return false;
	}

	public void registerUser(User user) {
		this.users.put(user.email, user);
	}
	
	public boolean checkUserAvailablity(User user) {
		return users.get(user.email) != null;
	}
	
	public boolean authenticate(User user, String password) {
		return Optional.ofNullable(users.get(user.email)).filter(u -> u.validPassword(password)).get() != null;
	}
	
	
}
