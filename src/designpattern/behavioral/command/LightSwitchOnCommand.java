package designpattern.behavioral.command;

public class LightSwitchOnCommand implements Command{
	
	private Light light;
	public LightSwitchOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchOn();
	}

}
