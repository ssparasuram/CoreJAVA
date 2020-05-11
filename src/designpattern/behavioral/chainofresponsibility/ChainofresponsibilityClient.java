package designpattern.behavioral.chainofresponsibility;

import java.util.Scanner;

public class ChainofresponsibilityClient {

	private static Server server;

	private static void init() {
		server = new Server();

		server.registerUser(new User("Parasu", "ram@emaple.com", "1234"));
		server.registerUser(new User("Admin", "admin@emaple.com", "root"));
		server.registerUser(new User("Priya", "krishna@emaple.com", "1243"));

		UserAvailabilityValidator userAvailValidator = new UserAvailabilityValidator(server);
		userAvailValidator.addNecxt(new EmailValidator())
						  .addNecxt(new AuthenticateValidator(server))
						  .addNecxt(new AuthorizeValidator());

		server.setValidator(userAvailValidator);

	}

	public static void main(String[] args) {

		init();

		boolean success;
		do {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter email ... ");
				String email = sc.nextLine();
				System.out.println("Enter password ... ");
				String password = sc.nextLine();

				success = server.login(new User("", email, password));
			} finally {
				System.out.println("Welcome ");
			}
		} while (!success);
	}

}
