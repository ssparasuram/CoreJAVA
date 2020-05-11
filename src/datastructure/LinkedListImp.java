package datastructure;
import java.util.List;
import java.util.LinkedList;


public class LinkedListImp {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new LinkedList<>();
		
		//Add number in the last
		
		l1.add(1);
		l1.add(2);
		
		l1.forEach(x -> {System.out.print(x + " ");} );
		
		System.out.println();
		// Add first
		
		l1.add(0,5);
		
		l1.forEach(x -> {System.out.print(x + " ");} );
		
		//remove last
		
		System.out.println(l1.remove(l1.size()-1));
		
		//remove first
		System.out.println(l1.remove(0));
		
		//size
		System.out.println(l1.size());
		
		//add at specific
		
		l1.add(1);
		l1.add(3);
		
		
		l1.forEach(x -> {System.out.print(x + " ");} );
		
		l1.add(2,5);
		System.out.println();
		
		l1.forEach(x -> {System.out.print(x + " ");} );
		
		
	}

}
