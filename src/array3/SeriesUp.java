package array3;

/*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.*/

public class SeriesUp {
    public int[] seriesUp(int n) {
        if(n == 0) {
            int[] zero = {};
            return zero;
        }
        int[] arr = new int[n * (n + 1) / 2];
        int index = arr.length - 1;
        int k = n;
        for(int j = 1; j < n; j++) {
            for(int i = k; i > 0; i--) {
                arr[index--] = i;
            }
            k--;
        }
        arr[0] = 1;
        return arr;
    }
}
