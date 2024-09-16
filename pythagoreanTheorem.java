// Find the length of the hypotenuse of the right-angle triangle.

// I/p: A = 2   B = 3,  N = 2
// o/p:  4
// I/p: A = 12   B = 5,  N = 2
// o/p:  13

public class pythagoreanTheorem {
    
    public static int findLengthOfTheHypotenuse(int A, int B) {

        int value = A*A + B*B;

        double squareValue =  Math.sqrt(value);

        int lengthOfHypotenuse = (int) Math.round(squareValue);

        return lengthOfHypotenuse;
    }

    public static void main(String[] args) {
        System.out.println(findLengthOfTheHypotenuse(2, 3));
        System.out.println(findLengthOfTheHypotenuse(12, 5));
    }
}
