// Find count of Magical numbers from 1 to N.
// A Number is magical if: 
//                         1) Convert to binary.
//                         2) Replace 0 with 1 and 1 with 2 in binary string.
//                         3) calculate sum of all digits in binary string.
//                         4) Resultant must be on ODD Number.

// Input: N = 5
// Output: 2

public class findCountOfMagicalNumberFrom1ToN {

    public static int findCountOfMagicalNumbers(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int zero = 0;

            while (num != 0) {
                if(num % 2 == 0) {
                    zero++;
                }
                num = num / 2;
            }
            
            if(zero % 2 == 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findCountOfMagicalNumbers(5));
        System.out.println(findCountOfMagicalNumbers(10));
    }

}
