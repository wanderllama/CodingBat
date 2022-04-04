package array2;

/*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.*/

public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int element : nums) {
            if(element > max) {
                max = element;
            } else if(element < min) {
                min = element;
            }
        }
        return max - min;
    }
}
