package recursion1;

/*Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.*/

public class CountHi2 {
    public int countHi2(String str) {
        if (str.length() < 2 || str.isEmpty()) {
            return 0;
        }
        if(str.length() < 4 && str.charAt(0) == 'x') {
            return 0;
        }
        int count = 0;
        if(str.charAt(0) == 'x' && str.charAt(1) == 'h' && str.charAt(2) == 'i') {
            return count + countHi2(str.substring(2));
        }
        if(str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            count++;
        }
        return count + countHi2(str.substring(1));
    }
}
