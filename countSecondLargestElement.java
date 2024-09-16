// Charles is given an array A. He wants to find the count of occurrences of second largest 
// element in the array. Your task is to help him find and return an integer value representing the 
// count of occurrence of the second largest element in an array.

// Note:
// If the array contains same element, then return 0.
// The array has only consecutive elements i.e in sorted order.

// Input: Arr[] = {1,2,3,3,4,4}, N = 6 => Output: 2
// Input: Arr1[] = {2,2,2,2}, N = 4 => Output: 0
// Input: Arr2[] = {5}, N = 1 => Output: 0

public class countSecondLargestElement {
    
    public static int cntSecondLargerElement(int[] arr, int N) {

        int count = 0;
        int index = N-1;

        while (index >= 0 && arr[index] == arr[N-1]) index--;

        if (index < 0) return 0;

        while (index != 1) {
            int secondLargestElement = arr[index];
            if (arr[index] == secondLargestElement) {
                count++;
                index--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int Arr[] = {1,2,3,3,4,4};
        int Arr1[] = {2,2,2,2};
        int Arr2[] = {5};
        System.out.println(cntSecondLargerElement(Arr, Arr.length));
        System.out.println(cntSecondLargerElement(Arr1, Arr1.length));
        System.out.println(cntSecondLargerElement(Arr2, Arr2.length));
    }

}
