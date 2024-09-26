// Nth Tribonacci Number.

public class tribonacciNumber {

    public static int triboNum(int n) {
        if (n == 0) return 0;
        int prev3 = 0, prev2 = 1, prev1 = 1; 
        for(int i = 3; i <= n; i++) {
           int curr = prev3 + prev2 + prev1;
           prev3 = prev2;
           prev2 = prev1;
           prev1 = curr; 
        }
        return prev1;
    }
    
    public static void main(String[] args) {
        System.out.println(triboNum(4));
    }
}
