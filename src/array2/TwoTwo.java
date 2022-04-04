package array2;

/*Given an array of ints, return true if every 2 that appears in the array is next to another 2*/

public class TwoTwo {
    public boolean twoTwo(int[] nums) {
        if(nums.length == 0) {
            return true;
        }
        if(nums.length == 1) {
            if(nums[0] == 2) {
                return false;
            } else {
                return true;
            }
        }
        if(nums[nums.length - 1] == 2) {
            if(nums[nums.length - 2] != 2) {
                return false;
            }
        }
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 ) {
                if(nums[i++ + 1] != 2) {
                    return false;
                }
            }
        }
        return true;
    }
}
