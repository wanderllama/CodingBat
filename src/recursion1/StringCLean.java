package recursion1;

/*Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza"*/

public class StringCLean {
    public String stringClean(String str) {
        if(str.length() < 3) {
            if(str.length() < 2) {
                return str;
            }
            if(str.charAt(0) == str.charAt(1)) {
                return "" + (str.charAt(0));
            }
        }
        int index = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                index++;
                for(int j = i + 1; j < str.length(); j++) {
                    if(str.charAt(j) == str.charAt(j + 1)) {
                        index++;
                    } else {
                        break;
                    }
                }
            }
            break;
        }
        return str.charAt(0) + stringClean(str.substring(index));
    }
}
