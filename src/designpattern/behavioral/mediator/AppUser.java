package designpattern.behavioral.mediator;

public abstract class AppUser {
	
	private Chat chat;
	
	private String name;
	
	private String userId;
	
	public AppUser(Chat chat, String name, String userId) {
		this.chat = chat;
		this.name = name;
		this.userId = userId;
	}

	public Chat getChat() {
		return chat;
	}

	public String getName() {
		return name;
	}

	public String getUserId() {
		return userId;
	}
	
	public abstract void sendMessage(String message, String userId);
	
	public abstract void receiveMessage(String message);
	

}
