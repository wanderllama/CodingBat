package recursion1;

/*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).*/

public class Factorial {
    public int factorial(int n) {
        int n2 = n;
        if(n < 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    //alternate -> switching the if statement to be the reverse and the return outside of the if statement is the stop condition'
        if(n2 > 1) {
            return fibonacci(n2 - 1) + fibonacci(n2 - 2);
        }
        return n2;
    }