package creackingcodinginterview.arraysandstring;

public class PalindromOfStirngPermutation {

	public static void main(String[] args) {

		String str = "apdggutgdpa";
		isPermutationPalindrome(str);
		
		isPermutationPalindromeWithOptimal(str);

	}
	
	private static void isPermutationPalindromeWithOptimal(String str) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		
		int[] frq = new int[z-a +1];
		int oddCount =0;
		for(char c : str.toCharArray()) {
			int val = getCharNumber(a, z, c); 
			if(val != -1) {
				frq[val]++;
				
				if(frq[val] %2 ==1) {
					oddCount++;
				}else {
					oddCount--;
				}
			}
			
			
		}
		
		if(oddCount <= 1) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
	
	private static int getCharNumber(int a, int z, char c) {

		int val = Character.getNumericValue(c);
		if(a<=val && val <= z ) {
			return val-a;
		}
		return -1;
	}

	private static void isPermutationPalindrome(String str) {
		char[] frq = new char[128];
		for (int i = 0; i < str.length(); i++) {
			frq[str.charAt(i)]++;
		}

		int oddCount = 0;
		for (int i = 0; i < 128; i++) {
			if (frq[i] % 2 != 0) {
				oddCount++;
			}
		}
		boolean isEvenChars = str.trim().replaceAll("\\s", "").length() % 2 == 0;
		if (isEvenChars && oddCount == 0) {
			System.out.println("Yes");
		} else if (!isEvenChars && oddCount == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
