package array2;

/*Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.*/

public class Has77 {
    public boolean has77(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 7 && (nums[i] == nums[i + 1] || nums[i] == nums[i + 2])) {
                return true;
            }
        }
        if(nums[nums.length - 2] == 7 && nums[nums.length - 2] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }
}
