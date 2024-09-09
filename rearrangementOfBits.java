// Alex gives you a positive number N and wants you to rearrange the bits of the
// number in its binary representation such that all set bits are in consecutive order.
// Your task is to find and return an integer value representing the minimum possible
// number that can be formed after re-arranging the bits of the number N.

// I/p: 10
// O/p: 1010

// I/p: 2
// O/p: 10

public class rearrangementOfBits {
 
    public static double minimumPossibleIntegerAfterRearrangementOfBits(int num) {
        int count = 0;
        while(num != 0) {
            count = count + (num & 1);
            num = num >> 1;
        }
                                        // G.P = (2^n - 1)
        double minimumPossibleInteger = Math.pow(2, count) - 1;

        if(minimumPossibleInteger > 0) {
            return minimumPossibleInteger;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        System.out.println(minimumPossibleIntegerAfterRearrangementOfBits(10));
        System.out.println(minimumPossibleIntegerAfterRearrangementOfBits(2));
    }
}
