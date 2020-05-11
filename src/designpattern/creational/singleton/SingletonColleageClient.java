package designpattern.creational.singleton;

public class SingletonColleageClient {

	public static void main(String[] args) {
		Colleage colleage = Colleage.getInstance("MyColleage");
		System.out.println(colleage.getName());
		
		Colleage otherColleage = Colleage.getInstance("OtherColleage");
		System.out.println(otherColleage.getName());
		
		
		Colleage otherColleage1 = Colleage.getInstance1("OtherColleage");
		System.out.println(otherColleage1.getName());
	}

}
