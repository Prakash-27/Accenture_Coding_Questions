// You are given an integer array coins representing coins of different
// denominations and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that 
// amount. if that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin.

// Example 1:
// I/p: int[] Arr = {1,2,5}, amount = 11
// O/p: 3
// Explanation: 11 = 5 + 5 + 1

// I/p: int[] Arr = {2}, amount = 3
// O/p: -1

// I/p: int[] Arr = {1}, amount = 0
// O/p: 0

public class coinChange {
    
    private static int findLowestCoins(int[] coins, int index, int amount) {
        if(index >= coins.length) return Integer.MAX_VALUE-1;
        if (amount == 0) return 0;

        int pick = Integer.MAX_VALUE-1, notpick = Integer.MAX_VALUE-1;

        if (coins[index] <= amount) {
            pick = 1 + findLowestCoins(coins, index, amount - coins[index]);
        }

        notpick = findLowestCoins(coins, index + 1, amount);

        if (pick < notpick) {
            return pick;
        } else {
            return notpick;
        } 
    }

    public static int coinChanges(int[] coins, int amount) {
        int result = findLowestCoins(coins, 0, amount);
        return (result == Integer.MAX_VALUE-1) ? -1 : result;
    }

    public static void main(String[] args) {
        int[] Arr = {1,2,5};
        int amount = 11;
        System.out.println(coinChanges(Arr, amount));
    }
}
