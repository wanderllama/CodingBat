package logic2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a != 13) {
            sum += a;
            if(b != 13) {
                sum += b;
                if (c != 13) {
                    sum+= c;
                }
            }
        }
        return sum;
    }
}
