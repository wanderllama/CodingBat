package recursion1;

/*Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.*/

public class Count11 {
    public int count11(String str) {
        if(str.length() < 3) {
            if(str.equals("11")) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        if(str.substring(0 , 2).equals("11")) {
            str = str.substring(1);
            count++;
        }
        return count + count11(str.substring(1));
    }
}
