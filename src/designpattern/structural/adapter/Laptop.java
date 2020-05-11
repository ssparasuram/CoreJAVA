package designpattern.structural.adapter;

public class Laptop {

	private Charger charger;
	
	private int currentChargeLevel;

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	public int getChargerLevel() {
		return currentChargeLevel;
	}

	public void chargeLaptop() {
		if (charger == null) {
			System.out.println("Kindly provide the charger");
			return;
		}
		currentChargeLevel = charger.charge();
		if(currentChargeLevel == 100) {
			System.out.println("100 % charged Kindly remove the charger");
			return;
		}
	}


}
