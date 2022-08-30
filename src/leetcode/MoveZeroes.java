package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;
        int writePosition = 0;
        while (index < nums.length) {
			if (index == writePosition && nums[index] != 0) {
				writePosition++;
				index++;
				continue;
			} else if (index == writePosition && nums[index] == 0) {
				index++;
				continue;
			} else if (nums[index] != 0){
				nums[writePosition] = nums[index];
				index++;
				writePosition++;
			} else {
				index++;
			}
		}
        
        for (int i = writePosition; i < nums.length; i++) {
			nums[i]= 0; 
		}
        
        System.out.println(Arrays.toString(nums));
    }
	
}
