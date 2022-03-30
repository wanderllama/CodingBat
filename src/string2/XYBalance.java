package string2;

/*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y'
char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can
balance multiple 'x's. Return true if the given string is xy-balanced.*/

public class XYBalance {
    public boolean xyBalance(String str) {
        int y = str.lastIndexOf('y');
        int x = str.lastIndexOf('x');
        if(y >= x) {
            return true;
        }
        return false;
    }
}
