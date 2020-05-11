package designpattern.creational.prototype;

public class PrototypeCarClient {

	public static void main(String[] args) {
		Car hyundai = new Hyundai("Hyundai", "ELANTRA");

		Car clonedhyundai = hyundai.clone();

		Car bmw = new BMW("BMW", "x7");

		Car clonedBMW = bmw.clone();

		if (hyundai != clonedhyundai) {
			System.out.println("Found Hyundai CAR");
			if (hyundai.getName() == clonedhyundai.getName()) {
				System.out.println("Both are same");
			} else {
				System.out.println("Not same ");
			}
		}

		if (bmw != clonedBMW) {
			System.out.println("Found BMW CAR");
			if (bmw.getModel() == clonedBMW.getModel()) {
				System.out.println("Both are same");
			} else {
				System.out.println("Not same ");
			}
		}

	}

}
