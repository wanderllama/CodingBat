package array2;

/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.*/


import java.util.Arrays;

public class CenteredAverage {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 100};
        int sum = 0;
        int[] maxMin = {nums[0] , nums[1]};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxMin[0]) {
                maxMin[0] = i;
            } else if(nums[i] < maxMin[1]) {
                maxMin[1] = i;
            }
        }
        System.out.println(Arrays.toString(maxMin));
        for(int i = 0; i < nums.length; i++) {
            if(i == maxMin[0] || i == maxMin[1]) {
                continue;
            } else {
                sum += nums[i];
            }
        }
        System.out.println(sum/(nums.length - 2));
    }
}
