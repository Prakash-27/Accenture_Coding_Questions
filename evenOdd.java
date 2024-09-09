// Jack has an array A of length N. He wants to label whether the number in the array is even or odd.
// your task is to help him find and return a string with labels even or odd in sequence 
// according to which the numbers appear in the array.

// Input: A[] = {1,2,3,4,5}, N = 5
// Output: "oddevenoddevenodd"

public class evenOdd {
    
    public static String labelEvenOrOddInSequenceAccordingNumbersAppearInTheArray(int[] A, int n) {

        String Answer = "";

        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 0) Answer = Answer + "even,";
            else Answer = Answer + "odd,";
        }

        return Answer;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        System.out.println(labelEvenOrOddInSequenceAccordingNumbersAppearInTheArray(A, A.length));
    }

}
