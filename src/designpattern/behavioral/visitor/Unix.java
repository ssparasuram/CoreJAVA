package designpattern.behavioral.visitor;

public class Unix implements SystemConfiguration {

	@Override
	public void deploy(NotePad notepad) {
		System.out.println(" install notepad in Unix");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notepad.install();
		
	}

	@Override
	public void deploy(Browser browser) {
		System.out.println(" install browser in Unix");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		browser.install();
		
	}

}