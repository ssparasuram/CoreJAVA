package designpattern.behavioral.strategy;

public class DailyPaper implements Campaign {

	@Override
	public void advertise(String message) {
		System.out.println(" Message ::" +message +" advitised in Daily nexs paper ");	
	}

}
