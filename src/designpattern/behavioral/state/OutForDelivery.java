package designpattern.behavioral.state;

public class OutForDelivery implements PackageState {

	private OutForDelivery() {

	}

	public static OutForDelivery getInstance() {
		return StateHelper.instance;
	}

	private static class StateHelper {
		private static final OutForDelivery instance = new OutForDelivery();
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Order is out for  delivery ");
		ctx.setCurrentState(Delivered.getInstance());

	}

}
