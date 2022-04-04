package array2;

/*Given an array of ints, return true if the array contains no 1's and no 3's.*/

public class Lucky13 {
    public boolean lucky13(int[] nums) {
        for(int element : nums) {
            if(element == 3 || element == 1) {
                return false;
            }
        }
        return true;
    }
}
