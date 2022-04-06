package array3;

/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)*/

public class MaxSpan {
    public int maxSpan(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[][] firstLast = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{1,-1,-1,-1,-1,-1,-1,-1,-1,-1}};
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(firstLast[0][temp] == -1) {
                firstLast[0][temp] = i;
            } else {
                firstLast[1][temp] = i;
            }
        }
        int span = 0;
        for (int i = 0; i < firstLast[0].length; i++) {
            if (firstLast[1][i] - firstLast[0][i] > span && firstLast[1][i] != -1 && firstLast[0][i] != -1) {
                span = firstLast[1][i] - firstLast[0][i];
            }
        }
        return span + 1;
    }
}
