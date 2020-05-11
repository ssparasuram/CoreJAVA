package designpattern.structural.adapter;

public class AdapterChargerClient {
	
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		Charger charger = new ChargerAdapter();

		laptop.setCharger(charger);
		
		while(laptop.getChargerLevel() <100) {
			laptop.chargeLaptop();
		}
		
	}

}
