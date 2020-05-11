package designpattern.structural.decorator;

public class LuxuryCarDecorator extends CarDecorator {

	public LuxuryCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void decorateCar() {
		super.decorateCar();
		System.out.println("Luxury feature Added");
	}

}
