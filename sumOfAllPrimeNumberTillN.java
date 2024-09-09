// Find sum of all prime number till N (Given)

// Input: 8
// Output: 17

public class sumOfAllPrimeNumberTillN {
    
    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfAllPrimeNumber(int N) {
        int sum = 0;

        for(int i = 2; i <= N; i++) {
            if(isPrime(i)) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllPrimeNumber(8));
    }

}
