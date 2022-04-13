package recursion1;

/*Count recursively the total number of "abc" and "aba" substrings that appear in the given string.*/

public class CountAbc {
    public int countAbc(String str) {
        if(str.length() < 3) {
            return 0;
        }
        int count = 0;
        if(str.substring(0 , 3).equals("abc") || str.substring(0 , 3).equals("aba")) {
            count++;
        }
        return count + countAbc(str.substring(1));
    }
}
