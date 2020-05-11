package leetcode;

import java.util.Stack;

public class MyStack {

	Stack<Integer> s;
	Integer minEle;

	// Constructor
	MyStack() {
		s = new Stack<Integer>();
	}

	// Prints minimum element of MyStack
	int getMin() {

		return minEle;
	}

	// prints top element of MyStack
	private int top() {

		Integer t = s.peek(); // Top element.

		if (t < minEle)
			return minEle;
		else
			return t;
	}

	// Removes the top element from MyStack
	void pop() {
		Integer t = s.pop();

		if (t < minEle) {
			minEle = 2 * minEle - t;
		}

	}

	// Insert new number into MyStack
	void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			System.out.println("Number Inserted: " + x);
			return;
		}

		// If new number is less than original minEle
		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
		}

		else
			s.push(x);

		System.out.println("Number Inserted: " + x);
	}

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(2147483646);
		s.push(2147483646);
		s.push(2147483647);
		System.out.println("top::" + s.top());
		s.pop();

		System.out.println("min::" + s.getMin()); // 0

		s.pop();

		System.out.println("min::" + s.getMin()); // 0
		s.pop();
		s.push(2147483647);
		System.out.println("top::" + s.top());
		System.out.println("min::" + s.getMin()); // 0
		s.push(-2147483648);

		System.out.println("top::" + s.top());
		System.out.println("min::" + s.getMin()); // 0
		s.pop(); // 3 0 2

		System.out.println("min::" + s.getMin()); // 0

	}

}
