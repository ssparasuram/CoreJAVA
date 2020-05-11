package designpattern.behavioral.mediator;

import java.util.HashMap;

public class ChatBox implements Chat{
	
	private HashMap<String, AppUser> users = new HashMap<>();

	@Override
	public void sendMessage(String message, String userId) {
		users.get(userId).receiveMessage(message);
	}

	@Override
	public void addUser(AppUser user) {
		users.put(user.getUserId(), user);
		
	}
	

}
