package designpattern.creational.builder;

public class CarBuilder {
	
	private String name;
	private String model;
	private String safety;
	
	public CarBuilder() {
		
	}
	
	public CarBuilder buildName(String name) {
		this.name = name;
		return this;
	}
	
	public CarBuilder buildModel(String model) {
		this.model = model;
		return this;
	}
	
	public CarBuilder buildSafety(String safety) {
		this.safety = safety;
		return this;
	}
	
	public Car getCar() {
		return new Car(name, model,safety);
	}
		
}
