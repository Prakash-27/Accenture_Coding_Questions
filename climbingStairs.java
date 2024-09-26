// same as leetcode's climbing stairs (1D-Dp Problem)

// You are climbing a staircase. It takes n steps to reach to top.
// Each time you can climb either 1 or 2 steps, In how many distinct ways can you climb to the top?

// I/p: n = 2
// O/p: 3

// I/p: n = 3
// O/p: 3


public class climbingStairs {

    public static int climbStairs(int n) {
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    // Greedy Approach
    public static int climbStairsGreedyApproach(int n, int m) {
        int a = n/m;
        int b = n%m;

        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(9));
        System.out.println(climbStairs(15));
        System.out.println(climbStairsGreedyApproach(5, 2));
        System.out.println(climbStairsGreedyApproach(10, 3));
    }
}
