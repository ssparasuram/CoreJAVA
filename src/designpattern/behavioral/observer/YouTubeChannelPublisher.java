package designpattern.behavioral.observer;

import java.util.ArrayList;

public class YouTubeChannelPublisher implements YouTubeChannel{
	
	ArrayList<YouTubeUser> users = new ArrayList<>();
	

	@Override
	public void subscribe(YouTubeUser user) {
		users.add(user);
	}

	@Override
	public void unSubscribe(YouTubeUser user) {
		users.remove(user);
		
	}

	@Override
	public void notifyUsers(Message message) {
		for(YouTubeUser user : users) {
			user.notifyContents(message);
		}
		
	}

}
