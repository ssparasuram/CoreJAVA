package designpattern.structural.bridge;

public class BasicRemote implements Remote{
	
	Device device;
	
	public BasicRemote(Device device) {
		this.device = device;
	}

	@Override
	public void volumeUp() {
		device.volumeUp();
		
	}

	@Override
	public void voulmeDown() {
		device.voulmeDown();
		
	}

	@Override
	public void channelUp() {
		device.channelUp();
		
	}

	@Override
	public void channelDown() {
		device.channelDown();
	}

	@Override
	public void power() {
		if(device.isSwitchedon()) {
			device.disable();
		} else {
			device.enable();
		}
	}

}
