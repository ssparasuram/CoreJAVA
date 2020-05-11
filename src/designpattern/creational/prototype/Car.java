package designpattern.creational.prototype;

public interface Car {

	public String getName();
	public String getModel();
	
	public Car clone();
}
