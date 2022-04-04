package array2;

/*Given an array of ints, return true if it contains no 1's or it contains no 4's.*/

public class No14 {
    public boolean no14(int[] nums) {
        int[] oneFour = {0 , 0};
        for(int num : nums) {
            if(num == 1) {
                oneFour[0]++;
            } else if(num == 4) {
                oneFour[1]++;
            }
        }
        if(oneFour[0] > 0 && oneFour[1] > 0) {
            return false;
        }
        return true;
    }
}
