package designpattern.behavioral.command;

public class Light {
	//this is the receiver class
	
	
	private String status;
	
	public void switchOn() {
		System.out.println("Light switched on");
		status = "on";
	}
	
	public void switchOff() {
		System.out.println("Light switched off");
		status = "off";
	}
	
	
	

}
