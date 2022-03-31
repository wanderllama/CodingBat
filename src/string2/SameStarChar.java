package string2;

/*Returns true if for every '*' (star) in the string,
if there are chars both immediately before and after the star, they are the same.*/

public class SameStarChar {
    public boolean sameStarChar(String str) {
        if(str.length() < 3 || !str.contains("*")) {
            return true;
        }
        boolean ok = false;
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) == '*' ) {
                if(str.charAt(i - 1) == str.charAt(i + 1)) {
                    ok = true;
                } else {
                    ok = false;
                    break;
                }
            }
        }
        return ok;
    }
}
