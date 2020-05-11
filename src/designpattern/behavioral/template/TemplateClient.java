package designpattern.behavioral.template;

import java.util.Scanner;

public class TemplateClient {
	
	
	public static void main(String[] args) {
		System.out.println(" Welcome to Social networking");
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Ente user choice for the network \n 1. FaceBook \n 2. Twitter");
			
			int choice  = Integer.parseInt(sc.nextLine());
			System.out.println("Enter your user name ");
			String userName  = sc.nextLine();
			
			System.out.println("Enter your password ");
			String password  = sc.nextLine();
			
			Network network = null;
			if(choice == 1) {
				network = new FaceBook(userName, password);
			} else if(choice == 2) {
				network = new Twitter(userName, password);
			} else {
				System.out.println("Invalid Choice");
				return;
			}
			String message = sc.nextLine();
			
			network.post(message);
			
		}
	}

}
