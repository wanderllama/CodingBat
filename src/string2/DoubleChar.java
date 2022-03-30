package string2;

/*Given a string, return a string where for every char in the original, there are two chars.*/

public class DoubleChar {
    public String doubleChar(String str) {
        String send = "";
        for(int i = 0; i < str.length(); i++) {
            send += "" + str.charAt(i) + str.charAt(i);
        }
        return send;
    }
}
