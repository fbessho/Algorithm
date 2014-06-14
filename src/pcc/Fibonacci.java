package pcc;

import com.google.common.base.Stopwatch;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Stopwatch timer = Stopwatch.createStarted();
        System.out.println("fib(10)=" + fib(10));
        System.out.println("Method took: " + timer.stop());

        timer.reset();
        timer.start();
        System.out.println("fib(40)=" + fib(40));
        System.out.println("Method took: " + timer.stop());

        timer.reset();
        timer.start();
        System.out.println("fib(100)=" + fib(100));
        System.out.println("Method took: " + timer.stop());
    }

    private static int[] memo = new int[1000];
    static
    {
        memo[1] = 1;
        memo[2] = 1;
    }

    public static int fib(int n)
    {
        if (memo[n]!=0) return memo[n];

        int retValue = fib(n - 1) + fib(n - 2);
        memo[n] = retValue;

        return retValue;
    }
}
