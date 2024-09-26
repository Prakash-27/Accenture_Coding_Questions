// Leetcode Problem
// Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize 
// the product of those integers.

// Return the maximum product you can get.

//I/p: n = 2
//O/p: 1
//I/p: n = 3
//O/p: 2
//I/p: n = 10
//O/p: 36

import java.util.Arrays;

public class integerBreak {

     /* The main function that returns the max possible product */
     static int helper(int n, int idx) {
        // base condition
        if (n == 0 || idx == 0)
            return 1;

        // recursive call for each step
        if (idx > n) return helper(n, idx - 1);

        // return the maximum result obtained from recursive calls
        int pick = idx * helper(n - idx, idx);
        int notPick = helper(n, idx - 1);

        return Math.max(pick, notPick);
    }

     /* The main function that returns the max possible product */
     static int helperDP(int n, int idx, int[][] dp) {
        // base condition
        if (n == 0 || idx == 0)
            return 1;

        if(dp[n][idx] != -1) return dp[n][idx];  

        // recursive call for each step
        if (idx > n) return helperDP(n, idx - 1, dp);

        // return the maximum result obtained from recursive calls
        int pick = idx * helperDP(n - idx, idx, dp);
        int notPick = helperDP(n, idx - 1, dp);

        return dp[n][idx] = Math.max(pick, notPick);
    }

    // max product function
    static int maxProd(int n) {
        return helper(n, n - 1);
    }

    static int maxProdDP(int n) {
        int[][] dp = new int[n+1][n+1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helperDP(n, n - 1, dp);
    }

// ----------------------------------------------------------------------------
   
    public static int power(int x, int n) { // TC -> O(log2 n)  SC -> O(1)
        // if n is negative we are making it 1/n
        int m = n;
        int ans = 1;

        while(n > 0) {
            // if n is odd we are seperating one power from original n and add it into ans.
            // (which will make odd n to even n)
            // And we are reducing one value from n (x^n => 2^3 => 2^1(odd) 2^2(even))
            if(n % 2 == 1) {
                ans = ans * x; 
                n = n - 1;
            }
            else if(n % 2 == 0) {
                n = n/2;
                x = x*x;
            }

            if(m < 0) {
                ans = 1/ans; // 5^-2 is 1/5^2 which is 1/25
            }
        }
        return ans;
    } 

    // This method is used to get the maximum product of integers that sum up to n
    public static int maxProduct(int n) {
         // If n is less than or equal to 3, the maximum product is n - 1
        if(n <= 3) return n - 1;

        int quotient = n / 3, remainder = n % 3;

        // If n remainder = n % 3 => 0, the maximum product is 3 raised to the power of (quotient)
        if(remainder == 0) return (int) Math.pow(3, quotient);

        // If n  remainder = n % 3 => 1, we use one 4 (as 2*2) and the rest as 3s
        if(remainder == 1) return (int) Math.pow(3, quotient - 1) * 4;

        // If n  remainder = n % 3 => 2, we use one 2 and the rest as 3s
        return (int) Math.pow(3, quotient) * 2;
    }

    public static void main(String[] args) {
        // System.out.println("Maximum Product is " + maxProd(2));
        // System.out.println("Maximum Product is " + maxProd(3));
        // System.out.println("Maximum Product is " + maxProd(10));

        // System.out.println("Maximum Product is " + maxProdDP(2));
        // System.out.println("Maximum Product is " + maxProdDP(3));
        // System.out.println("Maximum Product is " + maxProdDP(4));
        // System.out.println("Maximum Product is " + maxProdDP(10));

        // System.out.println(power(2, 2));

        System.out.println("Maximum Product is " + maxProduct(2));
        System.out.println("Maximum Product is " + maxProduct(3));
        System.out.println("Maximum Product is " + maxProduct(4));
        System.out.println("Maximum Product is " + maxProduct(9));
        System.out.println("Maximum Product is " + maxProduct(10));
        System.out.println("Maximum Product is " + maxProduct(11));
        System.out.println("Maximum Product is " + maxProduct(14));
        System.out.println("Maximum Product is " + maxProduct(15));
        System.out.println("Maximum Product is " + maxProduct(20));

    }
}
