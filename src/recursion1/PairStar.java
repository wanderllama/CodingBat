package recursion1;

/*Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".*/

public class PairStar {
    public String pairStar(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.length() == 1) {
            return "" + str.charAt(str.length() - 1);
        }
        if(str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
