package recursion1;

/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.*/

public class CountX {
    public int countX(String str) {
        int count = 0;
        if(str.isEmpty()) {
            return 0;
        }
        if(str.charAt(0) == 'x') {
            count = 1;
        } else {
            count = 0;
        }
        return count + countX(str.substring(1));
    }
}
