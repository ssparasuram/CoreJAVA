package designpattern.behavioral.command;

public class CommandClient {

	public static void main(String[] args) {

		Light light= new Light();
		
		LightSwitchOnCommand switchOn = new LightSwitchOnCommand(light);
		
		LightSwitchOffCommand switchOff = new LightSwitchOffCommand(light);
		
		RemoteControl remote = new RemoteControl();
		
		//Switch on
		remote.setCommand(switchOn);
		remote.pressSwitch();
		
		
		//Switch off
		remote.setCommand(switchOff);
		remote.pressSwitch();
		
	}

}
