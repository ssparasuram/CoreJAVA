package designpattern.behavioral.chainofresponsibility;

public class UserAvailabilityValidator extends Validator{

	private Server server;
	
	
	
	public UserAvailabilityValidator(Server server) {
		this.server = server;
	}



	@Override
	public boolean check(User user) {
		if(user != null) {
			if(! server.checkUserAvailablity(user)) {
				return false;
			}
			return checkNext(user);
		}
		return false;
	}

}
