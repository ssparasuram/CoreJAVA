package datastructure;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapImpl {

	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

		// Add the k , v
		lhm.put("tes3", "hello");
		lhm.put("test2", "world");

		System.out.println(lhm);
		
		// Add null key
		lhm.put(null, "dummy world");

		System.out.println(lhm);
		
		// Add duplicate
		lhm.put("test3", "world");

		System.out.println(lhm);


		

		// Get the value by key
		System.out.println(lhm.get("test3"));

		// Iterate
		for (Entry<String, String> entry : lhm.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());

		}
		System.out.println("insertion order");
		for (String k: lhm.keySet()) 
        { 
            System.out.print(k + ", ");  
        }

		System.out.println("");
		// check with contains value

		System.out.println("check value" + lhm.containsValue("world"));

		// check contains key

		System.out.println("cheak key" + lhm.containsKey("test1"));

		for (Entry<String, String> entry : lhm.entrySet()) {
			lhm.compute(entry.getKey(), (k, v) -> (v == "world") ? "matched :: " + v : v);
		}

		System.out.println(lhm);
		
		lhm.remove("test1");
		
		System.out.println(lhm);
	}

}
