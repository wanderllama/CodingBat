package array2;

/*For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.*/

import java.util.ArrayList;

public class TenRun {
    public int[] tenRun(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] % 10 != 0) {
                if(nums[i - 1] % 10 != 0) {
                    continue;
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return nums;
    }
}
