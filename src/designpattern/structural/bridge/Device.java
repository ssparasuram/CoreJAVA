package designpattern.structural.bridge;

public interface Device {
	  public String getname();
	  public void enable();
	  public void disable();
	  public void status();
	  public void volumeUp();
	  public void voulmeDown();
	  public void channelUp();
	  public void channelDown();
	  
	  public boolean isSwitchedon();
	  
	  public void setVolume(int volume);
}
