package designpattern.behavioral.strategy;

public class AdertiserStrategyClient {

	public static void main(String[] args) {
		Advertiser adv = new Advertiser(new TVNews());
		adv.advertise("Today is holiday");
		
		adv.setCampaign(new DailyPaper());
		adv.advertise("Good sale offers");

	}

}
