package ap1;

/*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array. Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.*/

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {
        int[] send = new int[count];
        for(int i = 0 , j = 0; count > 0; i++) {
            if(nums[i] < 11 || nums[i] > 89) {
                send[j++] = nums[i];
                count--;
            }
        }
        return send;
    }
}
