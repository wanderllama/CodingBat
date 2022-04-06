package array3;

/*Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).*/

public class SquareUp {
    public int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int index = arr.length - 1;
        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= n; j++) {
                if(j <= i) {
                    arr[index--] = j;
                } else {
                    arr[index--] = 0;
                }
            }
        }
        return arr;
    }
}
