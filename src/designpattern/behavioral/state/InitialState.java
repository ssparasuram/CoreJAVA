package designpattern.behavioral.state;

public class InitialState implements PackageState{
	
	private InitialState() {
		
	}

	public static InitialState getInstance() {
		return StateHelper.instance;
	}
	
	
	private static class StateHelper {
		private static final InitialState instance = new InitialState();
	}
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println(ctx.getPackageId() + " Order is Acknowledged and the package initialized .... ");
		ctx.setCurrentState(Shipped.getInstance());
		
	}

}
