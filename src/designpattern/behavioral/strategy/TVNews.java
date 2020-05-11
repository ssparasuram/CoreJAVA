package designpattern.behavioral.strategy;

public class TVNews implements Campaign{

	@Override
	public void advertise(String message) {
		System.out.println(" Message ::" +message +" advitised in TV ");
	} 

}
