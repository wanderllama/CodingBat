package string2;

/*Given a string, compute a new string by moving the first char to come after
the next two chars, so "abc" yields "bca". Repeat this process for each subsequent
group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.*/

public class OneTwo {
/*    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        if (str.length() < 4) {
            return str.substring(1) + str.charAt(0);
        }
        String x = "";
        for(int i = 3; i <= str.length();) {
            x += str.substring(0 , i) + " ";
            str = str.substring(i);
        }
        x = x.trim();
        String[] strs = x.split(" ");
        String send = "";
        for(int i = 0; i < strs.length; i++) {
            send += strs[i].substring(1) + strs[i].charAt(0);
        }
        return send;
    }*/

    //second approach
    public String oneTwo(String str) {
        if (str.length() < 3) {
            return "";
        }
        String send = "";
        while(str.length() >= 3) {
            send += str.substring(1 , 3) + str.charAt(0);
            str = str.substring(3);
        }
        return send;
    }
}
