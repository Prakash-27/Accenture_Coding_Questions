// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:
// 1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
// 2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// 3. Those number for which this process ends in 1 are happy.

// Example: 
// I/p: n = 19
// O/p: True

// Approach:
//  1. calculate the sum of square of digits 
//     if '1' return true, else if '1' Present in hashset return false, else ----
//  2. store the value in hashset.
//  3. Repeat 1 and 2.

import java.util.HashSet;

public class happyNumber {

    public static int  numSquareSum(int n) {
        int num = 0;
        while (n > 0) {
            int digit = n % 10;
            num += digit * digit;
            n = n / 10;
        }
        return num;
    }

    public static boolean isHappyNumber(int n) {
    
        HashSet<Integer> st = new HashSet<>();

        while(true) {
            n = numSquareSum(n);

            if (n == 1) {
                return true;
            }
    
            if (st.contains(n)) {
                return false;
            }
    
            st.add(n);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
}
