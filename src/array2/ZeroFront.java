package array2;

/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.*/

public class ZeroFront {
    public int[] zeroFront(int[] nums) {
        int count = 0;
        int replace = 1;
        for(int num : nums) {
            if(num == 0) {
                count++;
            } else {
                replace = num;
            }
        }
        int[] send = new int[nums.length];
        for(int i = count; i < send.length; i++) {
            send[i] = replace;
        }
        return send;
    }
}
