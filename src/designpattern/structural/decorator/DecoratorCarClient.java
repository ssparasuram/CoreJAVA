package designpattern.structural.decorator;

public class DecoratorCarClient {

	public static void main(String[] args) {
		
		CarDecorator  myCar = new LuxuryCarDecorator(new SportsCarDecorator(new BasicCar()));
		myCar.assemble();
		
		CarDecorator  myAnotherCar = new LuxuryCarDecorator(new BasicCar());
		myAnotherCar.assemble();
	}
}
