package designpattern.behavioral.visitor;

public class VisitorClient {

	public static void main(String[] args) {
		SystemConfiguration windows = new Windows();
		
		SystemConfiguration unix = new Unix();
		
		NotePad notepad = new NotePad();
		Browser browser  = new Browser();
		
		
		notepad.configure(windows);
		browser.configure(unix);
		
		
		notepad.configure(unix);
		browser.configure(windows);
	}

}
