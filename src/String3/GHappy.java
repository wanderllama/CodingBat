package String3;

/*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.*/

public class GHappy {
    public boolean gHappy(String str) {
        if(str.length() == 0) {
            return true;
        }
        if(str.equals("g")) {
            return false;
        }
        if(str.equals("gg")) {
            return true;
        }
        boolean happy = true;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'g') {
                if(str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                    happy = false;
                }
            }
        }
        if(str.charAt(str.length() - 1) == 'g' && (str.charAt(str.length() - 2) != 'g')) {
            return false;
        }
        return happy;
    }
}
