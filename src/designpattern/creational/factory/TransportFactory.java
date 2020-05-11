package designpattern.creational.factory;

public class TransportFactory {
	
	public static Transport getInstance( String mode) {
		
		if(mode != null && mode.equalsIgnoreCase("Ocean") ) {
			return new Ocean();
		} else {
			return new Road();
		}
	}

}
