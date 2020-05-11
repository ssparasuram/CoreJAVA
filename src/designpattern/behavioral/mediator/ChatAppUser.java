package designpattern.behavioral.mediator;

public class ChatAppUser extends AppUser{

	public ChatAppUser(Chat chat, String name, String userId) {
		super(chat, name, userId);
	}

	@Override
	public void sendMessage(String message, String userId) {
		System.out.println(" User ::"+ getName() +" Sending message to :: "+ message);
		getChat().sendMessage(message, userId);
		
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(" User ::"+ getName() +" Received message :: "+ message);
	}

}
