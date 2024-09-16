// Given 2 number, dice and num, if dice is even then print the sum of digits in odd index, if
// dice is odd then print the sum of digits in even index.

// I/p: int[] num = {1,2,3,4}; dice = 2 


public class diceAndNum {

    // public static int reverse(int n) {
    //     int rev = 0;

    //     while (n != 0) {
    //         int rem = n % 10;
    //         rev = rev * 10 + rem;
    //         n = n / 10;
    //     }

    //     return rev;
    // }

    public static int diceAndNumEvenOrOdd(int n, int dice) {
        int N = 0, sum1 = 0, sum2 = 0;

        int flag = 0;

        while(n != 0) {
            if (flag == 0) {
                sum1 = sum1 + n % 10;
            }
            else {
                sum2 = sum2 + n % 10;
            }

            n = n / 10;
            N++;
            flag = 1 - flag;
        }

        int even, odd;

        if(N % 2 == 0) {
            even = sum1;
            odd = sum2;
        }
        else {
            even = sum2;
            odd = sum1;
        }

        if(dice % 2 == 0) {
            return even;
        } 
        else {
            return odd;
        }
    }
    
    public static void main(String[] args) {
        int num = 1234;
        int num1 = 54873;
        int num2 = 457892;
        System.out.println(diceAndNumEvenOrOdd(num, 2));
        System.out.println(diceAndNumEvenOrOdd(num1, 2));
        System.out.println(diceAndNumEvenOrOdd(num2, 2));
    }
}
