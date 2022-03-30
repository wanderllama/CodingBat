package logic2;

/*For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit
is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10
if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the
sum of their rounded values. To avoid code repetition, write a separate helper "public int
round10(int num) {" and call it 3 times. Write the helper entirely below and at the same
indent level as roundSum().*/

public class RoundSum {
    public int roundSum(int a, int b, int c) {
        return round(a) + round(b) + round(c);
    }
    public int round(int n) {
        int r = n % 10;
        if (r >= 5) {
            return (10 - r) + n;
        } else {
            return n - r;
        }
    }
}
