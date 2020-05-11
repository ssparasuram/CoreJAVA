package designpattern.creational.singleton;

public class Colleage {
	// Immediate loading
	// private final Colleage instance = new Colleage();

	private volatile static Colleage lazyInstance = null;

	private Colleage(String name) {
		this.name = name;
	}
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	// synchronized can be used for thread safe
	public static Colleage getInstance(String name) {
		Colleage instance = lazyInstance;
		if (instance == null) {
			synchronized (Colleage.class) {
				instance = lazyInstance;
				if (instance == null) {
					instance = lazyInstance = new Colleage(name);
				}
			}
		}
		return instance;
	}
	
	//bill pugh implementation
	
	private static class InnerColleage{
		private static final Colleage INSTANCE = new Colleage("DEFAULT");
	}
	
	public static Colleage getInstance1(String name) {
		return InnerColleage.INSTANCE;
	}
}
