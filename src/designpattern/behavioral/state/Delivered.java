package designpattern.behavioral.state;


public class Delivered implements PackageState {

	private Delivered() {

	}

	public static Delivered getInstance() {
		return StateHelper.instance;
	}

	private static class StateHelper {
		private static final Delivered instance = new Delivered();
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println(ctx.getPackageId() +" Order is delivered successfully ");

	}

}
