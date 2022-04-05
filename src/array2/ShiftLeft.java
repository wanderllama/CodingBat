package array2;

/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.*/

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int[] sends = new int[0];
        if(nums.length == 0) {
            return sends;
        }
        int[] send = new int[nums.length];
        for(int i = 1; i < nums.length; i++) {
            send[i - 1] = nums[i];
        }
        send[send.length - 1] = nums[0];
        return send;
    }
}
