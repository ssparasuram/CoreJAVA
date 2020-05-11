package designpattern.behavioral.template;

public class Twitter extends Network {

	private String userName;
	private String password;

	public Twitter(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	@Override
	boolean login(String userName, String password) {
		System.out.println("Validating user's login");
		System.out.println("Name: " + this.userName);
		System.out.print("Password: ");
		for (int i = 0; i < this.password.length(); i++) {
			System.out.print("*");
		}
		simulateNetworkLatency();
		System.out.println("\n\nLogIn success on Twitter");
		return true;
	}

	@Override
	void logout() {
		System.out.println(" User " + this.userName + " successfully logged out");
	}

	@Override
	void sendData(String message) {
		
		System.out.println(" Message " + message + " posted via Twitter");

	}

}
