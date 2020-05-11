package designpattern.structural.decorator;

public class SportsCarDecorator extends CarDecorator{


	public SportsCarDecorator(Car car){
		super(car);
	}

	@Override
	public void decorateCar() {
		super.decorateCar();
		System.out.println("Sports feature Added");
	}

}
