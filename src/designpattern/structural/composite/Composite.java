package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;


public class Composite implements Component {
	public String name;
	public List<Component> components = new ArrayList<>();
	
	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name);

		for (Component com : components) {
			com.showPrice();
		}

		System.out.println("Total :: " + getPrice());

	}
	
	public void addComponent(Component comp) {
		this.components.add(comp);
	}

	@Override
	public Integer getPrice() {
		return components.stream().mapToInt(Component::getPrice).sum();
	}

}
