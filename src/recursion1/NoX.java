package recursion1;

/*Given a string, compute recursively a new string where all the 'x' chars have been removed.*/

public class NoX {
    public String noX(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.charAt(0) == 'x') {
            return "" + noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }
}
