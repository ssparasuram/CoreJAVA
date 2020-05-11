package creackingcodinginterview.arraysandstring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AreChractersUnique {

	public static void main(String[] args) {
		String data = "apyrpda";
		
		char[] cc = data.toCharArray();
		 Arrays.parallelSort(cc);
		 
		 System.out.println(new String(cc));
		
		
		System.out.println(areChractersUniqueWithCollections(data));

	}
	
	public static boolean areChractersUnique(String data) {
		
		
		//string has 26 car and check with 32 bit int
		
		int checker =0;
		for(int i =0; i< data.length(); i++) {
			
			int val = data.charAt(i)-'a';
			
			int dd = (checker & (1 << val));
			System.out.println("for :: "+data.charAt(i)+" val ::" + val + " checker :: "+ checker + " (1 << val) "+ (1 << val) + " checker & (1 << val) :: " + dd );
			
			if((checker & (1 << val)) > 0) {
				return false;
			}
			
			checker |= (1 << val);
		}
		
		return true;
	}
	
	
	public static boolean areChractersUniqueWithCollections(String data) {
		List<Integer> cl =  data.chars().boxed().collect(Collectors.toList());
		
		return ! (data.chars().filter(e-> Collections.frequency(cl, e)>1).count()>1);
		
	}

}
