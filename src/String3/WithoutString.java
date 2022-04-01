package String3;

/*Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive). You may assume that the remove string is
length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/

public class WithoutString {

    public static void main(String[] args) {

    String base = "THIS is a FISH", remove = "is";
    String send = "";

        for(
    int i = 0;
    i <=base.length()-remove.length();i++)

    {
        int j = 0;
        System.out.println(remove.charAt(j));
        if (("" + base.charAt(i)).equalsIgnoreCase("" + remove.charAt(j))) {
            int start = i;
            int end = start;
            i++;
            j++;
            //using i variable later cause letters to be skipped when for loop restarts
            //introduce new variable that will start at i and compare the right letters to j along the way
            //increment i to no repeat letters that are checked in while loop
            while (j < remove.length()) {
                if (("" + base.charAt(i++)).equalsIgnoreCase("" + remove.charAt(j))) {
                    end++;
                    j++;
                } else {
                    break;
                }
            }
            if (j == remove.length()) {
                base = base.substring(0, start) + base.substring(end + 1);
                System.out.println(base);///
            }
        }
    }
}
}
