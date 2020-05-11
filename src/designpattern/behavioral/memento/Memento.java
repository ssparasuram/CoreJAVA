package designpattern.behavioral.memento;

public class Memento {

	public static void main(String[] args) {
		SoftwarePackage sp = new SoftwarePackage("1.1", "TodDoApp");
		
		sp.setDescription("Data can be added");
		
		System.out.println(sp);
		
		SoftwareRepository repo1 = sp.addintoRepo();
		
		sp.setDescription("Data can be modified");
		

		System.out.println(sp);
		
		sp.undo(repo1);
		
		System.out.println("After undo :: ");
		System.out.println(sp);
	}

}
