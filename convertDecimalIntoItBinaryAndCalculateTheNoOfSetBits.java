// convert N into its binary and calculate the no of set bits.
// I/p: 15
// O/p: 4

public class convertDecimalIntoItBinaryAndCalculateTheNoOfSetBits {
    
    public static int calculateTheNoOfSetBitsCount(int N) {
        int count = 0;
        while (N != 0) {
            count += (N & 1);
            N = N >> 1; 
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calculateTheNoOfSetBitsCount(15));
    }
}
