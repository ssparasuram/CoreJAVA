package designpattern.structural.bridge;

public class TV implements Device {

	private final String name = "TV";
	private int volume;
	private int channel;
	
	private boolean swithcedOn;

	@Override
	public String getname() {
		return this.name;
	}

	@Override
	public void enable() {
		if(!this.swithcedOn) {
			this.swithcedOn = true;
		}

	}

	@Override
	public void disable() {
		if(this.swithcedOn) {
			this.swithcedOn = false;
		}

	}

	
	@Override
	public void status() {
		System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (this.swithcedOn ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
	}

	@Override
	public void volumeUp() {
		if(this.volume <10) {
			this.volume++;
		}

	}

	@Override
	public void voulmeDown() {
		if(this.volume >0) {
			this.volume--;
		}
	}

	@Override
	public void channelUp() {
		if (this.channel < 10) {
			this.channel++;
		}
	}

	@Override
	public void channelDown() {
		if (this.channel > 0) {
			this.channel--;
		}
	}
	
	@Override
	public boolean isSwitchedon() {
		
		return this.swithcedOn;
	}
	
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
