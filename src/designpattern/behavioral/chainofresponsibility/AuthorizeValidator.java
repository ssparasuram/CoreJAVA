package designpattern.behavioral.chainofresponsibility;

public class AuthorizeValidator extends Validator{

	@Override
	public boolean check(User user) {
		if(user != null) {
			if(user.email == "admin@emaple.com") {
				System.out.println("Welcome Admin");
			} else {
				System.out.println("Welcome User");
			}
			return checkNext(user);
		}
		return false;
	}

}
