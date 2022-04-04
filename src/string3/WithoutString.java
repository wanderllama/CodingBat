package string3;

/*Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive). You may assume that the remove string is
length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/

import java.util.ArrayList;

public class WithoutString {

    public static void main(String[] args) {
        //for testing
        String base = "hello there";
        String remove = "e";

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= base.length() - remove.length(); i++) {
            if (("" + base.charAt(i)).equalsIgnoreCase("" + remove.charAt(0))) {
                int count = 1;
                if (remove.length() > 1) {
                    for (int j = i + 1 , k = 1; k < remove.length(); j++ , k++) {
                        if (("" + base.charAt(j)).equalsIgnoreCase("" + remove.charAt(k))) {
                            count++;
                        }
                    }
                    if (count == remove.length() && !list.contains(i)) {
                        int indexAdd = i;
                        while (count > 0) {
                            list.add(indexAdd);
                            indexAdd++;
                            count--;
                            continue;
                        }
                    }
                } else if (remove.length() == 1) {
                    list.add(i);
                }
            }
        }
        String send = "";
        for (int i = 0; i < base.length(); i++) {
            if (!list.contains(i)) {
                send += base.charAt(i);
            }
        }
    }
}
