// Given an array of length n, find the length of largest subarray which contains equal
// number of 0s and 1s.

// I/p: int[] arr = {1,0,1,1,1,0,0};
// O/p: 6

// I/p: int[] arr1 = {0,0,1,1,0};
// O/p: 4

import java.util.HashMap;

public class lengthOfLargestSubArray {
    
    public static int lengthOfLargeSubArray(int[] arr, int n) {

        HashMap<Integer, Integer> hp = new HashMap<>();
        hp.put(0, -1);

        int prefix_sum = 0;
        int length = 0;

        for (int j = 0; j < arr.length; j++) {
            prefix_sum += (arr[j] == 1 ? 1 : -1);
            if (hp.containsKey(prefix_sum)) {
                int i = hp.get(prefix_sum);
                length = Math.max((int) length, (int) j-i);
            } 
            else {
                hp.put(prefix_sum, j);
            }
        }
        return length;    
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,0,0};
        int[] arr1 = {0,0,1,1,0};
        System.out.println(lengthOfLargeSubArray(arr, arr.length));
        System.out.println(lengthOfLargeSubArray(arr1, arr1.length));
    }
}
