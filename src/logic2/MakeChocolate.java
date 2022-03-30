package logic2;
/*We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and
big bars (5 kilos each). Return the number of small bars to use, assuming we always use
big bars before small bars. Return -1 if it can't be done.*/

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        for (int i = big * 5; i >= 0; i -= 5) {
            if (goal - i <= small) {
                for (int j = 0; j <= small; j++) {
                    if (i + j == goal) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}
