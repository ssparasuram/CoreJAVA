package designpattern.structural.composite;

public class leaf implements Component {
	public String name;
	public int price;

	@Override
	public void showPrice() {
		System.out.println(name + "::" + price);
	}

	public leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public Integer getPrice() {
		return price;
	}
	
	@Override
	public void addComponent(Component comp) {
		return;
	}

}
