package logic2;

public class LoneSum {

    public int loneSum(int a, int b, int c) {
        if (c == b && b == a) {
            return 0;
        }
        if(a == b) {
            return c;
        }
        if(c == a) {
            return b;
        }
        if(c == b) {
            return a;
        }
        return a + b + c;
    }

}
