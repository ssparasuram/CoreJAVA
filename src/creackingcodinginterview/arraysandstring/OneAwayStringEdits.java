package creackingcodinginterview.arraysandstring;

public class OneAwayStringEdits {
	/**
	 * One Away: There are three types of edits that can be performed on strings:
	 * insert a character, remove a character, or replace a character. Given two
	 * strings, write a function to check if they are one edit (or zero edits) away.
	 * EXAMPLE 
	 * pale, ple -> true 
	 * pales, pale -> true 
	 * pale, bale -> true 
	 * pale, bake -> false
	 */
	
	public static void main(String[] args) {
		String[][] ar = { { "pale", "ple" }, { "pales", "pale" }, { "pale", "bale" }, { "pale", "bake" } };

		for (String[] aa : ar) {
			System.out.print(aa[0] + " : " + aa[1]);
			int firstlen = aa[0].length();
			int secondlen = aa[1].length();

			if (Math.abs(firstlen - secondlen) > 1) {
				System.out.println(" :: More Edits");
				continue;
			}
			int min = Math.min(firstlen, secondlen);
			boolean oneAwayEdit = false;
			if (min > 1) {
				if (min == firstlen) {
					oneAwayEdit = findOneWayEdit(aa[0], aa[1]);
				} else {
					oneAwayEdit = findOneWayEdit(aa[1], aa[0]);
				}
			}
			if (oneAwayEdit) {
				System.out.println(" :: Only one Edit");
			} else {
				System.out.println(" :: More Edits found");
			}
		}
	}

	private static boolean findOneWayEdit(String str1, String str2) {

		int index1 = 0;
		int index2 = 0;
		boolean foundEdits = false;
		while (index2 < str2.length() && index1 < str1.length()) {
			if (str2.charAt(index2) != str1.charAt(index1)) {
				if (foundEdits)
					return false;

				foundEdits = true;
				if (str1.length() == str2.length()) {
					index1++;
				}

			} else {
				index1++;
			}

			index2++;
		}

		return true;
	}

}
