package designpattern.structural.adapter;

public class ChargerAdapter implements Charger {
	
	AppleCharger AppleCharger = new AppleCharger();
	@Override
	public Integer charge() {
		return AppleCharger.chargeLapTop();
	}

}
