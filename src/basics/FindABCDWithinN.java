package basics;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public class FindABCDWithinN {

	public static void main(String[] args) {
		int n = 1000;
		HashMap<Double, List<AbstractMap.SimpleEntry<Integer, Integer>>> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Double result = Math.pow(i, 3) + Math.pow(j, 3);
				if (result < n) {
					List<AbstractMap.SimpleEntry<Integer, Integer>> combinations = Optional.ofNullable(hm.get(result))
							.orElse(new ArrayList<>());
					combinations.add(getPair(i, j));
					hm.put(result, combinations);
				}
			}
		}

		for (Entry<Double, List<AbstractMap.SimpleEntry<Integer, Integer>>> entry : hm.entrySet()) {
			List<AbstractMap.SimpleEntry<Integer, Integer>> combinations = entry.getValue();
			for (AbstractMap.SimpleEntry<Integer, Integer> al : combinations) {
				System.out.println(al.getKey() + " ::" + al.getValue());
			}
		}
	}

	static AbstractMap.SimpleEntry<Integer, Integer> getPair(int a, int b) {
		return new AbstractMap.SimpleEntry<Integer, Integer>(a, b);
	}

}
