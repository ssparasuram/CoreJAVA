package designpattern.behavioral.observer;

public interface YouTubeChannel {

	public void subscribe(YouTubeUser user);
	public void unSubscribe(YouTubeUser user);
	public void notifyUsers(Message message);
	
}
