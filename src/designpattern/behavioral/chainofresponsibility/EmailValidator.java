package designpattern.behavioral.chainofresponsibility;

public class EmailValidator extends Validator{
	

	@Override
	public boolean check(User user) {
		if(user != null) {
			if(user.email == null ||  ! (user.email.contains("@"))) {
				return false;
			}
			return checkNext(user);
			
		}
		return false;
	}

}
