package ap1;

/*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.*/

public class HasOne {
    public boolean hasOne(int n) {
        String x = "" + n;
        char[] split = x.toCharArray();
        for(int i = 0; i < split.length; i++) {
            if(split[i] == '1') {
                return true;
            }
        }
        return false;
    }
}
