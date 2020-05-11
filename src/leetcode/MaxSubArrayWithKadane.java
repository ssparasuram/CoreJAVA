package leetcode;

public class MaxSubArrayWithKadane {

	/**
	 * using Kadane algorithms
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {-4,-1,1,3,-1,2,5,-4};
		
		int sum = maxSubArray(arr);
		System.out.println(sum);
		
	}
	
	public static int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int max_end = 0;
        
        int start = 0; int end = 0; int s = 0;
        
        for(int i=0; i< nums.length; i++){
            max_end = max_end + nums[i];
            if(max_so_far < max_end ) {
                max_so_far = max_end;
                start = s; end = i;
            }
            if(max_end <0){
                max_end = 0;
                s = i+1;
            }
        }
        System.out.println("Start ::"+ start + " end :: "+end);
        return max_so_far;
    }
}

