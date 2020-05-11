package designpattern.behavioral.state;

public class DeliveryContext {

	private String packageId;
	private PackageState currentState;

	public DeliveryContext(String packageId) {
		super();
		this.packageId = packageId;
		this.currentState = InitialState.getInstance();
	}

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public PackageState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(PackageState currentState) {
		this.currentState = currentState;
	}

	public void update() {
		currentState.updateState(this);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
