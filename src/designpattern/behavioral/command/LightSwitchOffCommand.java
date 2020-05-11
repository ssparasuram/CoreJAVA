package designpattern.behavioral.command;

public class LightSwitchOffCommand implements Command {

	private Light light;
	
	
	public LightSwitchOffCommand(Light light) {
		this.light = light;
	}


	@Override
	public void execute() {
		light.switchOff();
	}

}
