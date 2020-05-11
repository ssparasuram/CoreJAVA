package designpattern.behavioral.chainofresponsibility;

public class AuthenticateValidator extends Validator{
	
	private Server server;

	public AuthenticateValidator(Server server) {
		this.server = server;
	}


	@Override
	public boolean check(User user) {
		if(user != null) {
			if(server.authenticate(user, user.password)) {
				System.out.println("Valid Ueer");
				return checkNext(user);
			} else {
				System.out.println("Invalid user");
			}
		}
		return false;
	}

}
