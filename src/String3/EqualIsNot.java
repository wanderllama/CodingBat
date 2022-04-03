package String3;

/*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).*/

public class EqualIsNot {
    public boolean equalIsNot(String str) {
        if(str.length() == 0) {
            return true;
        }
        int is = 0;
        int not = 0;
        for(int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                is++;
            } else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
                not++;
            }
        }
        if(str.charAt(str.length() - 2) == 'i' && str.charAt(str.length() - 1) == 's') {
            is++;
        }
        return (is == not);
    }
}
