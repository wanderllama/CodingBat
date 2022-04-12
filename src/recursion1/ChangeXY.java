package recursion1;

/*Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.*/

public class ChangeXY {
    public String changeXY(String str) {
        if(str.indexOf("x") == -1) {
            return str;
        }
        return str.substring(0 , str.indexOf("x")) + "y" + changeXY(str.substring(str.indexOf("x") + 1));
    }
}
