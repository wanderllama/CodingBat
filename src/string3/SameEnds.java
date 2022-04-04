package string3;

/*Given a string, return the longest substring that appears at both the beginning
and end of the string without overlapping. For example, sameEnds("abXab") is "ab".*/

public class SameEnds {
    public String sameEnds(String string) {
        String send = "";
        for(int i = string.length() / 2; i > 0; i--) {
            if(string.substring(0 , i).equals(string.substring(string.length() - i))) {
                send = string.substring(0 , i);
                break;
            }
        }
        return send;
    }
}
