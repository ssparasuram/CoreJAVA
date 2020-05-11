package designpattern.structural.bridge;

public class BridgeRemoteClient {

	public static void main(String[] args) {

		testRmote(new TV());

		testRmote(new Radio());

	}
	

	private static void testRmote(Device device) {
		Remote basic = new BasicRemote(device);

		device.status();
		basic.channelUp();
		basic.volumeUp();
		device.status();

		AdvancedRemote advRmote = new AdvancedRemote(device);

		advRmote.mute();

		device.status();
	}

}
