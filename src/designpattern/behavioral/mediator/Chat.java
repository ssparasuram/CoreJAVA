package designpattern.behavioral.mediator;

public interface Chat {

	public void sendMessage(String message , String userId);
	
	public void addUser(AppUser user);
}
