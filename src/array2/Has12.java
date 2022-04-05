package array2;

/*Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.*/

public class Has12 {
    public boolean has12(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[j] == 2) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
