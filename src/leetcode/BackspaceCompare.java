package leetcode;

public class BackspaceCompare {

	public static void main(String[] args) {
		String S = "a##c";
		String T = "b";

		System.out.println(backspaceCompare(S, T));
	}

	public static boolean backspaceCompare(String S, String T) {

		int k = 0;
		int l = 0;
		char[] sChars = new char[S.length()];
		char[] tChars = new char[S.length()];
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#') {
				if (k > 0) {
					k--;
				}
			} else {
				if (k < S.length() && k >= 0) {
					sChars[k] = S.charAt(i);
				}
				k++;
			}

		}

		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) == '#') {
				if (l > 0) {
					l--;
				}
			} else {
				if (l < T.length() & l >= 0) {
					tChars[l] = T.charAt(i);
				}
				l++;
			}

		}
		S = new String(sChars);
		T = new String(tChars);
		return S.substring(0, k).equals(T.substring(0, l));
	}
}
