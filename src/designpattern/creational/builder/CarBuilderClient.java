package designpattern.creational.builder;

public class CarBuilderClient {

	public static void main(String[] args) {

		// This will help to avoid multiple parameter based object creation
		Car car = new CarBuilder().buildName("Honda").buildModel("Civic").buildSafety("STS").getCar();

		System.out.println(car);

	}
}
