package string3;

/*Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxBlock {
    public int maxBlock(String str) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0));
        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)) {
                count++;
                list.add(count);
            } else {
                list.add(count);
                count = 1;
            }
        }
        return Collections.max(list);
    }
}