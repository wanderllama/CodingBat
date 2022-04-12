package recursion1;

/*Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".*/

public class ChangePi {
    public String changePi(String str) {
        if(!str.contains("pi")) {
            return str;
        }
        return changePi(str.substring(0 , str.indexOf("pi")) + "3.14" + str.substring(str.indexOf("pi") + 2));
    }
}
