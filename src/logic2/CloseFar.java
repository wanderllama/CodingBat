package logic2;

/*Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.*/

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        int close = 0;
        int far = 0;

        int[] x = new int[3];
        x[0] = Math.abs(a - b);
        x[1] = Math.abs(b - c);
        x[2] = Math.abs(a - c);

        for(int y : x) {
            if (y < 2) {
                close++;
            }
            far++;
        }
        if(close == 1) {
            return true;
        }
        return false;
    }
}
