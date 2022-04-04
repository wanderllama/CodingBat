package array2;

/*Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.*/


public class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for(int element : nums) {
            if(element % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

