package leetcode;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,1};
		System.out.println(singleNumber( arr));
	}

	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			boolean unique = true;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					// result = nums[i];
					unique = false;
					break;
				}

			}
			if (unique) {
				result = nums[i];
				break;
			}
		}
		return result;
	}
	
	 public int singleNumberFinal(int[] nums) {
	        int result = 0;
	        for(int i : nums){
	           result ^= i;
	        }
	        return result;
	    }

}
