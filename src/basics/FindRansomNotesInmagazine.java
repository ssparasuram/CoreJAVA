package basics;

import java.util.HashMap;
import java.util.stream.Stream;

public class FindRansomNotesInmagazine {

	public static void main(String[] args) {
		String note = "My note found hello ";
		
		String mag = "Tomorrow My dear day note here not returned and found";
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		Stream.of(mag.split(" ")).forEach(a -> {hm.putIfAbsent(a, 0); hm.put(a, hm.get(a)+1);}); 
		if(Stream.of(note.split(" ")).filter(a-> a!= null).anyMatch(a -> hm.get(a) == null || hm.get(a) <=0)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}

}
