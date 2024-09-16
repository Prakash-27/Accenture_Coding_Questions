// Given an array A of length N and we have to find the sum of even Positions after reversing 
// the array. your task is to help him find and return an integer value representing sum of the 
// array elements present at the even positions of the reversed array.

// Input: int[] Arr = {1,2,3,4,1,2,0,1,2,3} , N = 10

// Approach:
// - no need to reverse the Array
// - Find the reversed index for each position Array
// - check for even odd.

public class sumOfTheArrayElementsPresentAtTheEvenPositionsOfReversedArray {
    
    public static int evenPositionOfReversedArray(int[] Arr, int N) {
        int sum = 0;

        for (int idx = 0; idx < N-1; idx++) {
            int ReverseIndex = (N - idx - 1);
            if (ReverseIndex % 2 == 0) sum += Arr[ReverseIndex]; 
        }
        return sum;
    }

    public static int[] reverseInteger(int[] Arr, int N) {
        for(int idx = 0; idx < N/2; idx++) {
            int temp = Arr[idx];
            Arr[idx] = Arr[N - idx - 1];
            Arr[N - idx - 1] = temp;
        }
        return Arr;
    } 

    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,1,2,0,1,2,3};
        System.out.println(evenPositionOfReversedArray(Arr, Arr.length));
        int[] Arr2 = reverseInteger(Arr, Arr.length);

        for (int i = 0; i < Arr2.length; i++) {
            System.out.print(Arr2[i]+ " ");
        }
    }
}
