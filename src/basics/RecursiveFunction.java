package basics;

public class RecursiveFunction {

	public static void main(String[] args) {
		
		getPermutationString("", "apa");

	}

	private static void getPermutationString(String prefix, String sub) {
		
		if(sub.length() <= 0) {
			System.out.println(prefix);
			return;
		} else {
			for(int i=0; i< sub.length(); i++) {
				getPermutationString(prefix+sub.charAt(i), sub.substring(0,i)+ sub.substring(i+1,sub.length()));
			}
		}
		
		
		
	}

}
