package designpattern.behavioral.observer;

public class ObserverClient {

	
	public static void main(String[] args) {
		YouTubeUser user1 = new YouTubeActiveUser("Ravi");
		YouTubeUser user2 = new YouTubeActiveUser("Arul");
		
		
		YouTubeChannel channel = new YouTubeChannelPublisher();
		
		channel.subscribe(user1);
		
		channel.notifyUsers(new Message("version 1 content"));
		
		channel.subscribe(user2);
		
		channel.notifyUsers(new Message("Version 2 content"));
		
		channel.unSubscribe(user1);
		
		channel.notifyUsers(new Message("full content"));
		
	}
}

