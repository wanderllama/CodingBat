package string2;

/*Return true if the given string contains an appearance of "xyz" where the xyz is not
directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.*/

public class xyzThere {
    public boolean xyzThere(String str) {
        if(str.length() < 3) {
            return false;
        }
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'x') {
                if(i == 0 && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                    return true;
                }
                if(str.charAt(i - 1) == '.') {
                    continue;
                } else if(str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                    return true;
                }
            }
        }
        return false;
    }
}
