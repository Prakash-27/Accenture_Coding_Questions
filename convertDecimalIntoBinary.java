// Convert a number N into its binary form (string).

// I/p: N = 10,  I/p: N = 3
// O/p: "1010"   O/p: "11"

public class convertDecimalIntoBinary {
    
    public static String decimalToBinary(int n) {
        String ans = "";

        while (n > 0) {
            int rem = n % 2;
            // if (rem == 0) {
            //     ans = 0 + ans;
            // } else {
            //     ans = 1 + ans;
            // }
            ans = (rem == 0 ? "0" : "1") + ans;
            n = n / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
        System.out.println(decimalToBinary(3));
    }
}
