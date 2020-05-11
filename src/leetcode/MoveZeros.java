package leetcode;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0,1};
		
		moveZeroes(nums);
		
		for(int i : nums) {
			System.out.print(i + " ");
		}

	}
	
	public static void moveZeroes(int[] nums ) {
		int j = 0;
        for(int i=0; i< nums.length; i++ ){
        	j = i+1;
            if(j > nums.length-1){
                break;
            }
            if(nums[i] ==0){
                while(nums[j] == 0) {
                    j++;
                    if(j > nums.length-1){
                        break;
                    }
                }
                nums[i] = nums[j];
                nums[j] = 0;
            }
            
        }
	}

	public static void moveZeroes1(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {

				while (j < nums.length - 1 && nums[j] == 0 ) {
					j++;
				}
				if (j > nums.length - 1) {
					break;
				}
				if (nums[j] != 0) {
					nums[i] = nums[j];
					nums[j] = 0;
					j++;
				}
				
			}
			j = i+1;
		}
	}

}
