package designpattern.behavioral.state;

public class StateClient {

	public static void main(String[] args) {
		DeliveryContext ctx = new DeliveryContext("Monday-Data");
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		

	}

}
