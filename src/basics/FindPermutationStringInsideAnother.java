package basics;

public class FindPermutationStringInsideAnother {

	public static void main(String[] args) {
		//Optimize & Solve Technique #2: DIY (Do It Yourself
		// Example: Given a smaller strings and a bigger string b, design an algorithm
		// to find all permutations of the shorter string within the longer one. Print
		// the location of each permutation
		
		String s= "abc";
		String b = "cbabadcbbabbcbabaabccbabc"; 
		int count =0;
		
		for(int i=0; i<b.length()-s.length(); i++) {
			String sub = b.substring(i, i+s.length());
			if(isPermutationMatched(s, sub)) {
				count +=1;
				int upper = i+s.length()-1;
				System.out.println("Matched SubString :: "+sub +" at postion "+i +" -> "+ upper);
			}
		}
		System.out.println("Total count :: "+count);
	}

	private static boolean isPermutationMatched(String main , String sub) {
		
		int[] chars = new int[26];
		for(int i=0; i< sub.length(); i++) {
			chars[sub.charAt(i) - 'a']++;
			chars[main.charAt(i) - 'a']--;
		}
		for(int i: chars) {
			if(i !=0) {
				return false;
			}
		}
		return true;
	}

}
