package string2;

/*Given two strings, a and b, create a bigger string made of the first charof a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.*/

public class MixString {
    public String mixString(String a, String b) {
        String mix = "";
        int x = -1;
        int y = -1;
        while(++x < a.length() && ++y < b.length()) {
            mix += "" + a.charAt(x) + b.charAt(y);
        }
        if(a.length() < b.length()) {
            return mix + b.substring(++y);
        }
        if(a.length() > b.length()) {
            return mix + a.substring(x);
        }
        return mix;
    }
}


