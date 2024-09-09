// Int nearestInteger(int num, int m)

// The function accepts two positive "num" and "m" as its argument. Implement the
// following function to find the nearest integer to num.

// 1) Number is divisible by m.
// 2) Number is nearest to "num" (Have the least distance from num)

// Note: if there are two numbers with the least distance from num, then return the larger num.

// Input 1:
// Num = 67
// M = 8

// Output 1: 64

// Input 2:
// Num = 26
// M = 3

// Output 2: 27

    


public class nearestInteger {
    
    public static int nearestNumber(int num, int m) {
        int r = num % m;

        if(r<(m+1)/2) { // If this is true return smaller number.
            return num-r;
        } 

        return num+(m-r); // // If this is false return larger number.
    }

    public static void main(String[] args) {
        int nearestNum = nearestNumber(67, 8);
        System.out.println("Nearest Number is: " + nearestNum);
    }

}
