package array2;

/*Given an array of ints, return true if every element is a 1 or a 4.*/

public class Only14 {
    public boolean only14(int[] nums) {
        for(int num : nums) {
            if(num != 1) {
                if(num != 4) {
                    return false;
                }
            }
        }
        return true;
    }
}
