package String3;

/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of
the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".*/

public class MirrorEnds {
    public String mirrorEnds(String string) {
        if(string.length() <= 1) {
            return string;
        }
        int count = 0;
        String send = "";
        for(int i = 0 , j = string.length() - 1; i < string.length() / 2; i++ , j--) {
            if(string.charAt(i) == string.charAt(j)) {
                send += string.charAt(i);
                count++;
            } else {
                return send;
            }
        }
        if(count == string.length() / 2) {
            return string;
        }
        return send;
    }
}
