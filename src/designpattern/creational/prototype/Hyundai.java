package designpattern.creational.prototype;

public class Hyundai implements Car{
	
	private String name;
	private String model;
	

	public Hyundai (String name, String model) {
		this.name = name;
		this.model = model;
	}
	
	public Hyundai(Hyundai target) {
		this.name = target.name;
		this.model = target.model;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getModel() {
		return this.model;
	}
	
	@Override
    public Car clone() {
        return new Hyundai(this);
    }

}
