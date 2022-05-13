package string2;

/*Return true if the given string contains an appearance of "xyz" where the xyz is not
directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.*/

public class xyzThere {
    public boolean xyzThere(String str) {
        while(str.contains("xyz")) {
            int index = str.indexOf("xyz");
            if(index == 0 || (str.charAt(index - 1) != '.')) {
                return true;
            }
            str = str.substring(index + 3);
        }
        return false;
    }
}
