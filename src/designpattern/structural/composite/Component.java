package designpattern.structural.composite;

public interface Component {
	void showPrice();

	Integer getPrice();
	
	void addComponent(Component comp);
}
