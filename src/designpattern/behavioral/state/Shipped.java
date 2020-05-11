package designpattern.behavioral.state;

public class Shipped implements PackageState{
	
	private Shipped() {
		
	}

	public static Shipped getInstance() {
		return StateHelper.instance;
	}
	
	
	private static class StateHelper {
		private static final Shipped instance = new Shipped();
	}
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Order is shipped ");
		ctx.setCurrentState(InTransition.getInstance());
		
	}

}