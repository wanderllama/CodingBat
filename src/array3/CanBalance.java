package array3;

/*Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.*/

public class CanBalance {
    public boolean canBalance(int[] nums) {
        int count = 0;
        while(count++ < nums.length) {
            int left = 0;
            int right = 0;
            for(int i = 0; i < count; i++) {
                left += nums[i];
            }
            for(int i = count; i < nums.length; i++) {
                right += nums[i];
            }
            if(left == right) {
                return true;
            }
        }
        return false;
    }
}
