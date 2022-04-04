package array2;

/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.*/

public class Either24 {
    public boolean either24(int[] nums) {
        int[] bool = {0 , 0};
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i + 1] == 2) {
                bool[0] = 1;
            } else if(nums[i] == 4 && nums[i + 1] == 4) {
                bool[1] = 1;
            }
            if(bool[0] == 1 && bool[1] == 1) {
                return false;
            }
        }
        return bool[0] == 1 || bool[1] == 1;
    }
}
