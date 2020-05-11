package designpattern.behavioral.chainofresponsibility;

public class User {

	protected final  String name;

	protected final String email;

	final String password;

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public boolean validPassword(String password) {
		return this.password.equals(password);
	}
}
