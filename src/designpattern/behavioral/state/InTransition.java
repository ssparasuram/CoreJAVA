package designpattern.behavioral.state;

public class InTransition implements PackageState {

	private InTransition() {

	}

	public static InTransition getInstance() {
		return StateHelper.instance;
	}

	private static class StateHelper {
		private static final InTransition instance = new InTransition();
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Order is in Transition ");
		ctx.setCurrentState(OutForDelivery.getInstance());

	}

}
