// Sieve Of Eratosthenes Method to find Prime Number

// N = 11

import java.util.Arrays;

public class findAllPrimeNumberUsingSieveOfEratosthenes {
    
    public static String sieveOfEratosthenes(int n) {
        
        // Create a boolean array and initialize all entries as true

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true); 
        primes[0] = primes[1] = false; // 0 and 1 are not prime numbers

        // Start with the first prime number, which is 2

        for(int p = 2; p * p <= n; ++p) {
           // If primes[p] is still true, then it is a prime number
          
           if(primes[p]) {
            // Mark all multiples of p as false (not prime)

            for(int i = p * p; i <= n; i += p) {
                primes[i] = false;
            }

           }
            
        }

        String value = " ";
        // Print all prime numbers
        for(int p = 2; p <= n; ++p) {
            if(primes[p]) {
               value = value + " " + p;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(sieveOfEratosthenes(n)); // 2 3 5 7 11
    }

}
