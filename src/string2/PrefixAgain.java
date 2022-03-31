package string2;

/*Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string is
not empty and that N is in the range 1..str.length().*/

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0 , n);
        String rest = str.substring(n);
        return rest.contains(prefix);
    }
}
