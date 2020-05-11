package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ExotHomeSates {

	public static List<Integer> cellCompete5(int[] states, int days) {
		// WRITE YOUR CODE HERE
		System.out.println(Arrays.stream(states).boxed().collect(Collectors.toList()));
		int prev = 0;
		int next = 0;

		while (days > 0) {

			for (int state = 0; state <= states.length-1; state++) {
				if (state == 0) {
					prev = 0;
					next =  states[state+1];
				} else if (state == states.length - 1) {
					next = 0;
				} else {
					next = states[state + 1];
				}

				int changeState = prev ^ next;

				prev = states[state];

				states[state] = changeState;

			}
			System.out.println(Arrays.stream(states).boxed().collect(Collectors.toList()));

			days--;
		}

		return Arrays.stream(states).boxed().collect(Collectors.toList());

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static List<Integer> cellCompete(int[] states, int days) {
		// WRITE YOUR CODE HERE
		System.out.println(Arrays.stream(states).boxed().collect((Collectors.toList())));
		int totalStates = states.length;
		System.out.println(totalStates);
		int pre = 0;
		int next = 0;
		while (days > 0) {
			for (int i = 0; i <= totalStates - 1; i++) {
				if (i == 0) {
					pre = 0;
					next =  states[i+1];
				} else if (i == totalStates - 1) {
					next = 0;
				} else {
					next = states[i + 1];
				}

				int change = pre ^ next;
				pre = states[i];
				states[i] = change;
			}
			days--;
		}
		List<Integer> finalStage = Arrays.stream(states).boxed().collect((Collectors.toList()));
		return finalStage;
	}

	// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
	// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
	// DEFINE ANY CLASS AND METHOD NEEDED
	// CLASS BEGINS, THIS CLASS IS REQUIRED

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int generalizedGCD(int num, int[] arr) {
		// WRITE YOUR CODE HERE
		List<Integer> gcds = new ArrayList<Integer>();
		// find the min number
		int minInt = Arrays.stream(arr).min().getAsInt();

		// find the primenumber with in min number
		TreeSet<Integer> numbers = new TreeSet();
		int p = 2;
		int n = minInt;
		if (n > 0) {
			while (n > 1) {
				if (n >= p * p) {
					if (n % 2 == 0) {
						n = n / p;
					} else {
						p = p + 1;
					}
					numbers.add(n);
				} else {
					numbers.add(n);
					break;
				}
			}
		}
		numbers.add(minInt);

		// interate to check till the max primenumber to devide all the given number

		int maxGCD = 1;
		for (int a : numbers.descendingSet()) {
			if (Arrays.stream(arr).allMatch(x -> x % a == 0)) {
				maxGCD = a;
				break;
			}
		}

		return maxGCD;
	}
	// METHOD SIGNATURE ENDS

	public static void main(String[] args) {
		int[] states = { 1, 1, 1, 0, 1, 1, 1, 1 };
		int days = 2;

		int[] arr = { 12, 8, 32 };
		System.out.println(cellCompete(states, days));
		// System.out.println( generalizedGCD(5,arr));
	}
	// METHOD SIGNATURE ENDS
}
