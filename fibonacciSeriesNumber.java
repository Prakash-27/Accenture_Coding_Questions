// Fibonacci Series Number

// Fibonacci series => 0, 1, 1, 2, 3, 5, 8.....

// I/p: N = 1   I/p: N = 0   I/p: N = 4
// O/p: 1       O/p:  0      O/p:  4

// Recursive Approach    => O(n) O(n)
// Bottom up             => O(N) O(1)
// Matrix Multiplication => O(logn) O(logn)

public class fibonacciSeriesNumber {
    
    public static int fib(int n) {
        // Bottom up
        int pre2 = 0, pre1 = 1;

        for (int i = 2; i <= n; i++) {
            int current = pre2 + pre1;
            pre2 = pre1;
            pre1 = current;
        }
        return pre1;
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
