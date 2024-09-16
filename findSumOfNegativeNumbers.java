// You are given four integers a, b, c and d. Find the sum of negative number out of these four numbers and print the same.

// Note: Print 0 if no negative number is present.

// Input: 2 -3 -14 7
// Output: -17

public class findSumOfNegativeNumbers {
    
    public static int sumOfNegativeNumbers(int a, int b, int c, int d) {
        int sum = 0;

        if(a < 0) sum += a;
        if(b < 0) sum += b;
        if(c < 0) sum += c;
        if(d < 0) sum += d;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNegativeNumbers(2, -3, -14, 7));
        System.out.println(sumOfNegativeNumbers(1, -2, 1, -3));
    }
}
