package string2;

/*Given a string and an int n, return a string made of the first n characters of the string,
followed by the first n-1 characters of the string, and so on. You may assume that n is
between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).*/

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String fron = "";
        for(int i = 0; i < n; n--) {
            String front = str.substring(0 , n);
            fron += front;
        }
        return fron;
    }
}
