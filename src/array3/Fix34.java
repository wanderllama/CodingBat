package array3;

/*Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.*/

import java.util.ArrayList;

public class Fix34 {
    public int[] fix34(int[] arr) {
        int[] send = new int[arr.length];
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                index.add(i);
                index.add(i + 1);
            } else if (arr[i] != 3 && arr[i] != 4) {
                other.add(arr[i]);
            }
        }
        for (int i = 0 , j = 0; i < send.length; i++) {
            if (index.contains(i)) {
                send[i] = 3;
                send[i++ + 1] = 4;
            } else {
                send[i] = other.get(j++);
            }
        }
        return send;
    }
}
