package datastructure;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();

		// Add the k , v
		tm.put("tes3", "hello");
		tm.put("test2", "world");
		tm.put("test1", "world");
		System.out.println(tm);
		
		// Add null key // this will not allowed
		//tm.put(null, "dummy world");

		System.out.println(tm);
		
		// Add duplicate
		tm.put("test3", "world");

		System.out.println(tm);


		

		// Get the value by key
		System.out.println(tm.get("test3"));

		// Iterate
		for (Entry<String, String> entry : tm.entrySet()) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());

		}
		System.out.println("insertion order");
		for (String k: tm.keySet()) 
        { 
            System.out.print(k + ", ");  
        }

		System.out.println("");
		// check with contains value

		System.out.println("check value" + tm.containsValue("world"));

		// check contains key

		System.out.println("cheak key" + tm.containsKey("test1"));

		for (Entry<String, String> entry : tm.entrySet()) {
			tm.compute(entry.getKey(), (k, v) -> (v == "world") ? "matched :: " + v : v);
		}

		System.out.println(tm);
		
		tm.remove("test1");
		
		System.out.println(tm);
	}
	
}
