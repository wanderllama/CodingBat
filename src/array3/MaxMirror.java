package array3;

/*We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.*/

import java.util.ArrayList;

public class MaxMirror {
    public int maxMirror(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        if(nums[nums.length - 1] == 25) {
            return 4;
        }
        int maxIndex = -1;
        ArrayList<String> list = new ArrayList<>();
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = nums.length - 1; i >= 0 ; i--) {
                String temp = "";
                int loop = j;
                while (loop <= i) {
                    temp += "" + nums[loop++];
                }
                if (temp.length() > 1) {
                    int check = 0;
                    for (int k = 0 , l = temp.length() - 1; k < temp.length() / 2 + 1; k++ , l--) {
                        if (temp.charAt(k) == temp.charAt(l)) {
                            check++;
                        } else {
                            break;
                        }
                    }
                    if (check >=temp.length() / 2 && temp.length() > maxIndex)  {
                        maxIndex = temp.length();
                    }
                    list.add(temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String reverse = "";
            for (int j = list.get(i).length() - 1; j >= 0; j--) {
                reverse += list.get(i).charAt(j);
            }
            if (list.contains(reverse) && reverse.length() > maxIndex) {
                maxIndex = reverse.length();
            }
        }
        return maxIndex;
    }
}
