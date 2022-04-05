package array2;

/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.*/

public class Post4 {
    public int[] post4(int[] nums) {
        if(nums[nums.length - 1] == 4) {
            int[] x = {};
            return x;
        }
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 4) {
                index = i + 1;
            }
        }
        int[] send = new int[nums.length - index];
        for(int i = index , j = 0; j < send.length; i++ , j++) {
            send[j] = nums[i];
        }
        return send;
    }
}
