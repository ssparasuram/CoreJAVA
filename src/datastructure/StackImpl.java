package datastructure;

import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		
		//Add elements
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(6);
		System.out.println(st);
		
		// Add at specific location
		
		st.add(3, 5);
		System.out.println(st);
		
		//pop the last value
		
		System.out.println(st.pop());
		
		//Size
		System.out.println(st.size());
		
		
		//peak the the last element
		
		System.out.println(st.peek());
		
		
	}

}
