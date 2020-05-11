package designpattern.behavioral.template;

public abstract class Network {
	
	String userName;
	String password;
	
	abstract boolean login(String username, String password);
	abstract void logout();
	
	public void post(String message) {
		if(login(this.userName, this.password)) {
			sendData(message);
			logout();
		} else {
			System.out.println("Invalid credentials");
		}
	}
	
	protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
	
	abstract void sendData(String message);

}
