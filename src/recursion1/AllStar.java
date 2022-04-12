package recursion1;

/*Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".*/

public class AllStar {
    public String allStar(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.length() == 1) {
            return "" + str.charAt(str.length() - 1);
        }
        String send = str.substring(0, 1) + "*";
        return  send + allStar(str.substring(1));
    }
}
