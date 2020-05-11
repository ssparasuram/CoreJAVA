package designpattern.behavioral.visitor;

public class Browser implements Installer {

	@Override
	public void install() {
		System.out.println("Insaltion done for"+Browser.class);
		
	}

	@Override
	public void uninstall() {
		System.out.println("Uninsaltion done for"+Browser.class);
		
	}

	@Override
	public void configure(SystemConfiguration system) {
		system.deploy(this);
	}

}
