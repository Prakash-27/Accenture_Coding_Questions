// Given an integer n, return the least number of perfect square numbers that sum to n.

// A perfect square is an integer that is the square of an integer; in other 
// words, it is the product of some integer with itself, for example, 1. 4. 9, and 16 
// are perfect squares while 3 and 11 are not.

// Ex:
// I/p: N = 12
// O/p: 3
// Explanation: 12 = 4 + 4 + 4.

// I/p: N = 13
// O/p: 2
// Explanation: 13 = 4 + 9.

import java.util.*;

public class prefectSquares {

    public static int solve(int N, int x, int[][] dp) {

        if(N == 0) return 0;
        if(x*x > N) return Integer.MAX_VALUE-1;

        if(dp[N][x] != -1) return dp[N][x];

        int pick = 1 + solve(N-(x*x), x, dp);
        int notPick = solve(N, x+1, dp);

        return dp[N][x] = Math.min(pick, notPick);
    }

    public static int numSquares(int n) {
        int[][] dp = new int[n+1][(int) Math.sqrt(n) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n, 1, dp);
    }
    
    public static void main(String[] args) {
        int N = 12;
        int N1 = 13;
        System.out.println(numSquares(N));
        System.out.println(numSquares(N1));
    }
}
