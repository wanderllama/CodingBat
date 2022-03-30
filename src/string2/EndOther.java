package string2;

/*Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.*/

public class EndOther {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        String aEnd = "";
        String bEnd = "";
        for (int i = a.length() - 1 , j = b.length() - 1 , k = 0; i >= 0 && j >= 0 && k < 3; i-- , j-- , k++) {
            aEnd = a.charAt(i) + aEnd;
            bEnd = b.charAt(j) + bEnd;
        }
        if(aEnd.contains(b) || bEnd.contains(a)) {
            return true;
        }
        return false;
    }
}
