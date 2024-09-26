// Given an array of n distinct integers. The task is to check whether reversing any one sub-array
// can make the array sorted or not, If the array is already sorted or can be made sorted by reversing 
// any one subarray, print "Yes" else print "No"

// Ex:
// I/p: int[] Arr = {1,2,5,4,3}; N = 5.
// O/p: Yes (if it is 12345)

// I/p: int[] Arr1 = {1,2,4,5,3}; N = 5.
// O/p: No (if it is 12354)



import java.util.Arrays;

public class reversingASubArrayMakeTheArraySortedOrNot {
    
    public static boolean reverseOneSubArrayMakesTheArraySortedOrNot(int[] arr, int n) {
        // copying the array.
        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // sort the Array
        Arrays.sort(temp);

        int front, back;

        // finding the first mismatch
        for (front = 0;  front < n; front++) {
            if(temp[front] != arr[front]) {
                break;
            }
        }
        // finding the last mismatch
        for (back = n-1;  back >= 0; back--) {
            if(temp[back] != arr[back]) {
                break;
            }
        }

        // If whole array is sorted 
        if (front >= back) {
            return true;
        }

        // checking subarray is decreasing or not/
        do {
            front++;
            if (arr[front - 1] < arr[front]) {
                return false;
            }
        } while(front != back);

        return true;
    } 

    public static void main(String[] args) {
        int[] Arr = {1,2,5,4,3};
        int[] Arr1 = {1,2,4,5,3};
        System.out.println(reverseOneSubArrayMakesTheArraySortedOrNot(Arr, Arr.length));
        System.out.println(reverseOneSubArrayMakesTheArraySortedOrNot(Arr1, Arr1.length));
    }
}
