package designpattern.behavioral.visitor;

public class NotePad implements Installer {

	@Override
	public void install() {
		System.out.println("Insaltion done for"+NotePad.class);
		
	}

	@Override
	public void uninstall() {
		System.out.println("Uninsaltion done for"+NotePad.class);
		
	}

	@Override
	public void configure(SystemConfiguration system) {
		system.deploy(this);
	}

}
