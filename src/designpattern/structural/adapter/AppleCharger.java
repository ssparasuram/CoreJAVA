package designpattern.structural.adapter;

import java.util.concurrent.atomic.AtomicInteger;

public class AppleCharger {

	AtomicInteger chargerlevel = new AtomicInteger();
	public String type;

	public Integer chargeLapTop() {
		this.type = "Apple";
		if (chargerlevel.get() == 0) {
			System.out.println("Charging Started");
		} else {
			System.out.println("Charging from " + chargerlevel.get() + " %");
		}
		return chargerlevel.addAndGet(10);

	}

}
