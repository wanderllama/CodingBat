package array2;

/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.*/

public class Pre4 {
    public int[] pre4(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 4) {
                index = i;
                break;
            }
        }
        int[] send = new int[index];
        for(int i = 0; i < index; i++) {
            send[i] = nums[i];
        }
        return send;
    }
}
