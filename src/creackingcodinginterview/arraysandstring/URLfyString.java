package creackingcodinginterview.arraysandstring;

public class URLfyString {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		int  trueLength = 13;
		
		System.out.println(str.trim().replaceAll("\\s", "%20"));
		
		System.out.println(str.trim().length());
		
		int index = 0;
		int spaceCount =0;
		for(int i= 0; i< trueLength; i++ ) {
			if(str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		
		System.out.println(spaceCount);
		
		index = trueLength + spaceCount*2;
		
		System.out.println('\0');
		System.out.println(spaceCount);
		
		char[] strs = str.toCharArray();
		if(trueLength < str.length()) strs[trueLength] = '\0'; // last index
		
		for(int i =trueLength-1; i>=0; i-- ) {
			
			if(strs[i] == ' ') {
				strs[index-1] = '0';
				strs[index-2] = '2';
				strs[index-3] = '%';
				index -=3;
			} else {
				strs[index-1] = strs[i];
				index--;
			}
		}
		System.out.println(new String(strs));
	}

}
