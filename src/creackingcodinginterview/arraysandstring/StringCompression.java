package creackingcodinginterview.arraysandstring;

public class StringCompression {

	public static void main(String[] args) {

		/**
		 * Implement a method to perform basic string compression using the counts of
		 * repeated characters. For example, the string aabcccccaaa would become
		 * a2blc5a3. If the "compressed" string would not become smaller than the
		 * original string, your method should return the original string. You can
		 * assume the string has only uppercase and lowercase letters (a -z)
		 */
		
		String str = "aabcccccaaar";
		
		String str1 = "achter";
		
		int finalLength = finalCompressedLength(str);
		System.out.println(finalLength);
		if(finalLength >= str.length() ) {
			System.out.println("no compression required");
			System.out.println(str);
			return;
		}
		
		
		int count =0;
		
		StringBuilder sb = new StringBuilder(finalLength);
		
		for(int i=0; i< str.length(); i++) {
			count ++;
			if(i+1 >= str.length() || str.charAt(i+1) != str.charAt(i)) {
				sb.append(str.charAt(i));
				if(count >1) {
					sb.append(count);
				}
				count = 0;
			}
		}
		
		System.out.println(sb.toString());
	}
	
	private static int finalCompressedLength(String str) {
		int finalcount = 0;
		int count = 0;
		for(int i=0; i< str.length(); i++) {
			count ++;
			if(i+1>= str.length() || str.charAt(i+1) != str.charAt(i)) {
				finalcount += 1+ String.valueOf(count).length();
				count = 0;
			}
		}
		return finalcount;
	}

}
