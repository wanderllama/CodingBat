package array2;

/*Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.*/
import java.util.Arrays;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        if(nums.length == 0) {
            int[] x = {};
            return x;
        }
        if(nums[nums.length - 1] == 7) {
            int o = -1;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] % 2 == 1 && nums[i] > o) {
                    o = nums[i];
                }
            }
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    nums[i] = o;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                int odd = -1;
                while(++i < nums.length && nums[i] != 0) {
                    if(nums[i] % 2 == 1 && nums[i] > odd) {
                        odd = nums[i];
                    }
                }
                i--;
                if(odd != -1) {
                    for(int j = 0; j < i + 1; j++) {
                        if(nums[j] == 0) {
                            nums[j] = odd;
                        }
                    }
                }
            }
        }
        return nums;
    }
}
