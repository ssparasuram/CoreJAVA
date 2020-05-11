package designpattern.behavioral.memento;

public class SoftwareRepository {

	private String version;
	private String name;
	private String description;
	
	public SoftwareRepository(String version, String name, String description) {
		super();
		this.version = version;
		this.name = name;
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	
	
	
}
