package array3;

/*(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.*/

import java.util.ArrayList;

public class Fix45 {
    public int[] fix45(int[] arr) {
        int[] send = new int[arr.length];
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index.add(i);
                index.add(i + 1);
            } else if (arr[i] != 4 && arr[i] != 5) {
                other.add(arr[i]);
            }
        }
        for (int i = 0 , j = 0; i < send.length; i++) {
            if (index.contains(i)) {
                send[i] = 4;
                send[i++ + 1] = 5;
            } else {
                send[i] = other.get(j++);
            }
        }
        return send;
    }
}
