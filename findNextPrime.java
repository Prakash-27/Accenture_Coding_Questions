// Given two numbers A,B given A is prime number
// we have to check the B is next prime after A.

// Input: A = 7, B = 13
// Output: false

// Input: A = 7, B = 11
// Output: true

public class findNextPrime {

    public static boolean isPrime(int n) {
        if(n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int nextPrime(int n) {
        n = n + 1;
        while(true) {
            if(isPrime(n)) {
                return n;
            }
            n++;
        }
    }

    public static boolean isNextPrime(int A, int B) {
        if(!isPrime(A) || !isPrime(B)) {
            return false;
        }
        return nextPrime(A) == B;
    } 
    
    public static void main(String[] args) {
        int A = 7, B = 13;
        int A1 = 7, B1 = 11;

        System.out.println(isNextPrime(A, B));
        System.out.println(isNextPrime(A1, B1));

        System.out.println(isPrime(11));
    }
}
