package array2;

/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.*/


public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int[] index = {0, 0};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index[0] = i;
            } else if (nums[i] > max) {
                max = nums[i];
                index[1] = i;
            }
        }
        if(min == max) {
            return min;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index[0] && i != index[1]) {
                sum += nums[i];
            }
        }
        return sum / (nums.length - 2);
    }
}
