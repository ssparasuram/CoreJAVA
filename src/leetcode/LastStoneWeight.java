package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastStoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stones = { 1, 3 };

		System.out.println(lastStoneWeight(stones));
	}

	public static int lastStoneWeight(int[] stones) {

		// ArrayList<Integer> stoneList =
		// Arrays.stream(stones).boxed().collect(Collectors.toList());

		List<Integer> stoneList = Arrays.stream(stones) // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.toList());
		Collections.sort(stoneList);

		while (stoneList.size() >= 2) {
			int last = stoneList.remove(stoneList.size() - 1);
			int second = stoneList.remove(stoneList.size() - 1);
			int diff = last - second;
			if (diff > 0) {
				stoneList.add(last - second);
				Collections.sort(stoneList);
			}
		}

		if (stoneList.size() > 0) {
			return stoneList.get(0);
		}
		return 0;

	}

	public int lastStoneWeight_best(int[] stones) {

		Arrays.sort(stones);
		int len = stones.length - 1;
		while (len > 0) {
			int last = stones[len];
			int second = stones[len - 1];
			if (second == 0) {
				return last;
			}
			if (last == 0) {
				return 0;
			}

			int diff = last - second;
			stones[len] = diff;
			stones[len - 1] = 0;
			Arrays.sort(stones);

		}

		return stones[len];

	}

}
