// You are given a special Fibonacci sequence defined by the following recurrence relation:
// f(N) = f(N-1)xf(N-1)+f(N-2)xf(N-2)
// with initial conditions:
// f(0) = 1
// f(1) = 1

// Input: N = 5
// Output: 20
// Input: N = 1
// Output: 1

// N =>    0 1 2 3  4  5
// f(n) => 1 1 2 5 29 866 % 47 = 20

public class fibonacciSequence {
    
    public static int fibSequence(int N) {
        int a = 1; // f(0) = 1
        int b = 1; // f(1) = 1

        for (int i = 2; i <= N; i++) {
            int c = (a*a + b*b)%47;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibSequence(5));
    }

}
