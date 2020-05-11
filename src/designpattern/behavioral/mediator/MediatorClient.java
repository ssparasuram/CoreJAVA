package designpattern.behavioral.mediator;

public class MediatorClient {

	public static void main(String[] args) {
		
		
		Chat chatbox = new ChatBox();
		
		AppUser user1 = new ChatAppUser(chatbox, "Ram", "1");
		AppUser user2 = new ChatAppUser(chatbox, "Arun", "2");
		AppUser user3 = new ChatAppUser(chatbox, "Mani", "3");
		chatbox.addUser(user1);
		chatbox.addUser(user2);
		chatbox.addUser(user3);
		
		user1.sendMessage("Hello ....", "3");
		
		user2.sendMessage("Hi How are you ....", "1");
		
		
	}
}
