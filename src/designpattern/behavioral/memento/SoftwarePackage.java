package designpattern.behavioral.memento;

public class SoftwarePackage {

	private String version;
	private String name;
	private String description;

	public SoftwarePackage(String version, String name) {
		this.version = version;
		this.name = name;
	}
	
	

	public void setDescription(String description) {
		this.description = description;
	}



	public SoftwareRepository addintoRepo() {
		SoftwareRepository repo = new SoftwareRepository(this.version, this.name, this.description);
		return repo;
	}
	
	public void undo(SoftwareRepository repo) {
		this.version = repo.getVersion();
		this.name = repo.getName();
		this.description = repo.getDescription();
	}

	@Override
	public String toString() {
		return "SoftwarePackage [version=" + version + ", name=" + name + ", description=" + description + "]";
	}

}
