package recursion1;

/*Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.*/

public class ChangeXY {
    public String changeXY(String str) {
        if(str.isEmpty()) {
            return str;
        }
        if(str.charAt(0) == 'x') {
            str = str.replace('x' , 'y');
        }
        return str.substring(0);
    }
}
