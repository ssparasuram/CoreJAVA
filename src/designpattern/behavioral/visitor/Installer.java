package designpattern.behavioral.visitor;

public interface Installer {
	
	public void install();
	public void uninstall();
	public void configure(SystemConfiguration system);

}
