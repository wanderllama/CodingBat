package ap1;

/*Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.*/

public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] send = new int[count];
        for(int i = 0 , j = 0; count > 0; i++) {
            if(nums[i] % 2 == 0) {
                send[j++] = nums[i];
                count--;
            }
        }
        return send;
    }
}
