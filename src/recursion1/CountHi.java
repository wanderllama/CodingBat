package recursion1;

/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.*/

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        if(str.length() < 2) {
            return 0;
        }
        if(str.substring(0 , 2).equals("hi")) {
            count = 1;
        } else {
            count = 0;
        }
        return count + countHi(str.substring(1));
    }
}
