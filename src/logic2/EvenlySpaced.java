package logic2;

/*Given three ints, a b c, one of them is small, one is medium and one is large. Return true if
the three values are evenly spaced, so the difference between small and medium is the
same as the difference between medium and large.*/

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if (a == b && a == c && b == c) {
            return true;
        }
        if (a == b || a == c || b == c) {
            return false;
        }
        if (spaced(a , b) == spaced(a , c)) {
            return true;
        }
        if (spaced(a , b) == spaced(b , c)) {
            return true;
        }
        if (spaced(a , c) == spaced(b , c)) {
            return true;
        }
        return false;
    }
    public int spaced(int x , int y) {
        return Math.abs(x - y);
    }
}
