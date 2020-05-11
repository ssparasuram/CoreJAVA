package designpattern.behavioral.observer;

public class YouTubeActiveUser implements YouTubeUser {

	private String name;

	public YouTubeActiveUser(String name) {
		this.name = name;
	}

	@Override
	public void notifyContents(Message message) {
		System.out.println("User :: " + name + " Recived message :: " + message.getMessage());
	}

}
