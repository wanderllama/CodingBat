package recursion1;

/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

public class Count7 {
    public int count7(int n) {
        int c = 0;
        if(n < 7) {
            return 0;
        }
        if(n % 10 == 7) {
            c = 1;
        } else {
            c = 0;
        }
        return c + count7(n / 10);
    }
}
