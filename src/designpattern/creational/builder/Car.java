package designpattern.creational.builder;

public class Car {

	private String name;
	private String model;
	private String safety;
	
	public Car(String name, String model, String safety) {
		super();
		this.name = name;
		this.model = model;
		this.safety = safety;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", safety=" + safety + "]";
	}
	
	
	
}

