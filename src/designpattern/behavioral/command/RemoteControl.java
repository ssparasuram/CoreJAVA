package designpattern.behavioral.command;

public class RemoteControl {

	// This is invoker
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressSwitch() {
		command.execute();
	}
}
