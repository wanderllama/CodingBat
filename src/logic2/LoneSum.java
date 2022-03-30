package logic2;

/*Given 3 int values, a b c, return their sum. However,
if one of the values is the same as another of the values,
it does not count towards the sum.*/

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
