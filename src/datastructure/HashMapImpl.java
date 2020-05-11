package datastructure;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		// Add the k , v
		hm.put(1, "hello");
		
		hm.put(2, "world");

		System.out.println(hm);

		// Add duplicate
		hm.put(3, "world");

		System.out.println(hm);

		// Add null key
		hm.put(null, "dummy world");

		System.out.println(hm);
		
		System.out.println("insertion order");
		for (Integer k: hm.keySet()) 
        { 
            System.out.print(k + ", ");  
        }
		System.out.println();
		// Get the value by key
		System.out.println(hm.get(1));

		// Iterate
		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());

		}

		// check with contains value

		System.out.println("check value" + hm.containsValue("world"));

		// check contains key

		System.out.println("cheak key" + hm.containsKey(1));

		for (Entry<Integer, String> entry : hm.entrySet()) {
			hm.compute(entry.getKey(), (k, v) -> (v == "world") ? "matched :: " + v : v);
		}

		System.out.println(hm);
		
		hm.remove(1);
		
		System.out.println(hm);
	}

}
