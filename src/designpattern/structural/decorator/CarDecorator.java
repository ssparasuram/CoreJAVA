package designpattern.structural.decorator;

public class CarDecorator implements Car {
	private Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public void decorateCar() {
		car.assemble();
	}

	@Override
	public void assemble() {
		this.decorateCar();
	};
}
