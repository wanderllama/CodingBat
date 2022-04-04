package array2;

/*Given an array of ints, return true if the number of 1's is greater than the number of 4's*/

public class More14 {
    public boolean more14(int[] nums) {
        int one = 0;
        int four = 0;
        for(int num : nums) {
            if(num == 1) {
                one++;
            } else if(num == 4) {
                four++;
            }
        }
        return one > four;
    }
}
