package array2;

/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.*/

public class HaveThree {
    public boolean haveThree(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        int count = 0;
        if(nums[0] == 3) {
            count++;
            if(nums[1] == 3) {
                return false;
            }
        }
        if(nums[nums.length - 1] == 3) {
            count++;
        }
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == 3) {
                count++;
                if(nums[i - 1] == 3 || nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }
}
