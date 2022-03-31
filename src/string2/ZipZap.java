package string2;

/*Look for patterns like "zip" and "zap" in the string -- length-3,
starting with 'z' and ending with 'p'. Return a string where for
all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".*/

public class ZipZap {
    public String zipZap(String str) {
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                str = str.substring(0 , i) + str.substring(i++ + 1);
            }
        }
        return str;
    }
}
