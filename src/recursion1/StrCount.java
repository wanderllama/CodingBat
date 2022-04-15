package recursion1;

/*Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.*/

public class StrCount {
    public int strCount(String str, String sub) {
        if(str.length() < sub.length()) {
            return 0;
        }
        int count = 0;
        if(str.substring(0 , sub.length()).equals(sub)) {
            count++;
            return count + strCount(str.substring(sub.length()) , sub);
        }
        return count + strCount(str.substring(1) , sub);
    }
}
