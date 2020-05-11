package designpattern.structural.bridge;

public class AdvancedRemote extends BasicRemote {

	Device device;

	public AdvancedRemote(Device device) {
		super(device);

		this.device = device;

	}
	
	public void mute() {
		this.device.setVolume(0);
	}

}
