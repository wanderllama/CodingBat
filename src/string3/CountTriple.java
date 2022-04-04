package string3;

/*We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.*/

public class CountTriple {
    public int countTriple(String str) {
        int triple = 0;
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                triple++;
            }
        }
        return triple;
    }
}
