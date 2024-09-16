// You are given an array arr of length n. Find and print the element at the mid-index of arr
// ignoring all the indices at which negative numbers are present in the array.

// Notes:
//        - In case there are two mid indices, print the element at the smaller index.
//        - You may assume that there will be at least one positive number in arr.

// Input: N = 6, Arr[] = {12,-3,14,-56,77,13}
// Output: 14

public class positiveMidElement {

    public static int findPositiveMidElement(int[] arr, int n) {
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                size++;
            }
        }

        int mid = (size - 1)/2;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (mid == 0) {
                    return arr[i];
                } else {
                    mid--;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,-3,14,-56,77,13};
        int[] arr1 = {-5,-7,10,-3,8,4,6,-9,15,12};
        System.out.println(findPositiveMidElement(arr, arr.length));
        System.out.println(findPositiveMidElement(arr1, arr1.length));
    }

}
