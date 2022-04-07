package ap1;

/*Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice decomposition, write a separate helper method which finds the largest special score in an array. Write your helper method after your scoresSpecial() method in the JavaBat text area.
*/

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        int largeA = largeSpecial(a);
        int largeB = largeSpecial(b);
        return largeA + largeB;
    }
    public int largeSpecial(int[] x) {
        int send = 0;
        for(int i = 0; i < x.length; i++) {
            if(x[i] % 10 == 0 && x[i] > send) {
                send = x[i];
            }
        }
        return send;
    }
}