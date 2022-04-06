package array3;

/*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.*/

public class CountClumps {
    public int countClumps(int[] nums) {
        int clump = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                clump++;
                while(i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return clump;
    }
}
