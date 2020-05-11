package designpattern.behavioral.strategy;

public class Advertiser {
	
	private Campaign campaign;

	public Advertiser(Campaign campaign) {
		this.campaign = campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	public void advertise(String message) {
		this.campaign.advertise(message);
	}
	
}
