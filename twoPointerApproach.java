// Given an array of random numbers, push all the zero's of a given array to the end of the array.
// All non-zero elements should come in front and order of all non-zero elements should be same.

// Input Format: 
// Given an array of random numbers.

// Output Format:
// Move all zeros to end of array and keeping all non-zero element in same position.

// Input:  1 2 0 4 3 0 5 0
// Output: 1 2 4 3 5 0 0 0

// Input:  1 2 0 0 0 3 6
// Output: 1 2 3 6 0 0 0

public class twoPointerApproach {

    public static int[] leftIsNonZeroAndRightIsZeroElements(int[] arr, int n) {
        
        if(n == 0) return arr;

        int count = 0;
        int i = 0;
        int j = 0;

        for(i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            } else {
                count++;
            }
        }

        for (i = j; i < n; i++) {
            arr[i] = 0;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {5,0,7,0,0,5};
        int n = arr.length;

        int arr1[] = {1,2,0,4,3,0,5,0};
        int n1 = arr1.length;

        int arr2[] = leftIsNonZeroAndRightIsZeroElements(arr, n);
        int arr3[] = leftIsNonZeroAndRightIsZeroElements(arr1, n1);
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        
    }

}