package string2;

/*Return a version of the given string, where for every star (*) in the string the star
and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd"
also yields "ad".*/

public class StarOut {
    public String starOut(String str) {
        String send = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0) {
                    str = "-" + str.substring(1);
                } else if ((i == str.length() - 1)) {
                    str = str.substring(0 , str.length() - 1) + "-";
                } else {
                    str = str.substring(0 , i) + "-" + str.substring(i + 1);
                }
            }
        }
        if(!str.contains("-")) {
            return str;
        }
        String[] strs = str.split("-");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].isEmpty()) {
                continue;
            } else if (i == 0) {
                send += strs[i].substring(0 , strs[i].length() - 1);
            } else if (i != strs.length - 1) {
                send += strs[i].substring(1 , strs[i].length() - 1);
            } else {
                send += strs[i].substring(1);
            }
        }
        return send;
    }
}
