// A googly prime number is defined as a number that is derived from the sum of its individual
// digits. For example, if N = 43, the sum of its individual digits is 4 + 3 = 7, which is prime
// making it a googly prime number 43.

// Yur task is to find whether the current number is googly prime number or not.

// I/p: 43
// O/p: YES

// I/p: 123
// O/p: NO

// I/p: 92
// O/p: YES

public class googlyPrime {

    private static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static String sumOfIndividualDigitsIsGooglePrimeOrNot(int N) {
        int sum = 0; 

        while(N != 0) {
            sum = sum + N % 10;
            N = N / 10;
        }

        if(isPrime(sum)) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(sumOfIndividualDigitsIsGooglePrimeOrNot(43));
        System.out.println(sumOfIndividualDigitsIsGooglePrimeOrNot(123));
        System.out.println(sumOfIndividualDigitsIsGooglePrimeOrNot(92));
    }

}
