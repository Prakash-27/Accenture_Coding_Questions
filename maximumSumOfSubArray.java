// Given an integer array nums, (1<=len(num) <=10^5) find the subarray with the largest sum,
// and return its sum.

// Input: [-2,1,-3,4,-1,2,1,-5,4]     ----->>>>>    Output: 6,   [4,-1,2,1]
// Input: [5,4,-1,7,8]                ----->>>>>    Output: 23,  [5,4,-1,7,8]
// Input: [3,-1,2,5,-6,3]             ----->>>>>    Output: 9,   [3,-1,2,5]

public class maximumSumOfSubArray {

    public static int maxSubArrayByKadanesAlgorithm(int[] arr, int n) {
        if(n == 0) return 0;

        int currentSum = 0;
        int maxSum = arr[0];

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
        
            // maxSum = Math.max(maxSum, currentSum); // alternate step for below code.
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }



    public static void main(String[] args) {
        // int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int a[] = {3,-1,2,5,-6,3};
        int n = a.length;

        int maxsum = maximumSumOfSubArray.maxSubArrayByKadanesAlgorithm(a, n);

        System.out.println("Maximum Sum of Sub Array is: " + maxsum);
    }

}