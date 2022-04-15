package recursion1;

/*Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.*/

public class StrDist {
    public int strDist(String str, String sub) {
        if(str.length() < 3) {
            return 0;
        }
        if(str.length() == 4) {
            str = str.substring(0 , str.length() - 1);
            if (str.equals(sub)) {
                return 3;
            } else {
                return 0;
            }
        }
        if(str.substring(0 , 3).equals(sub)) {
            if(str.charAt(str.length() - 1) == ' ') {
                str = str.substring(0 , str.length() - 1);
                return 3 + strDist(str.substring(3) , sub);
            } else {
                str += " ";
                return 3 + strDist(str.substring(3) , sub);
            }
        }
        if(str.charAt(str.length() - 1) == ' ') {
            return 1 + strDist(str.substring(1) ,  sub);

        }
        return 0 + strDist(str.substring(1) , sub);
    }
}
