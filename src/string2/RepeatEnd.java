package string2;

/*Given a string and an int n, return a string made of n repetitions of the last n characters of
the string. You may assume that n is between 0 and the length of the string, inclusive.*/

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        if (n == 0) {
            return "";
        }
        String ends = str.substring(str.length() - n);
        String end = "";
        for(int i = 0; i < n; i++) {
            end += ends;
        }
        return end;
    }
}
