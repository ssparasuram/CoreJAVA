package creackingcodinginterview.arraysandstring;

public class StringRotation {

	/**
	 * Assume you have a method i 5Su b 5 tr ing which checks if one word is a
	 * substring of another. Given two strings, 51 and 52, write code to check if 52
	 * is a rotation of 51 using only one call to i5Sub5tring (e.g., "waterbottle"
	 * is a rotation of"erbottlewat").
	 */

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";

		// Regardless of where the division between x and y is, we can see that yx will
		// always be a substring of xyxy.That is, s2 will always be a substring of s1s1.
		if(s1.length()  == s2.length() && s1.length() > 0) {
			boolean isRotaionSubString = (s1+s1).indexOf(s2) > -1;
			if(isRotaionSubString) {
				System.out.println("Rotation is a subString");
				return;
			}
		}
		System.out.println("Rotation is not matched subString");
		
	}

}
