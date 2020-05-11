package designpattern;

public class Singleton {

	private static Singleton instance;

	public String name;

	private Singleton(String value) {
		this.name = value;
	}

	public static Singleton getInstance(String value) {

		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
	
	

}
