package array3;

/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.*/

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int count = inner.length;
        for(int i = 0; i < inner.length; i++) {
            for(int j = 0; j < outer.length; j++) {
                if(inner[i] == outer[j]) {
                    count--;
                    break;
                }
            }
        }
        return count == 0;
    }
}