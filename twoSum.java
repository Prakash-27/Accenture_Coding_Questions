import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem Statement: Given an array of integers arr[] and an integer target.

   1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
   
   2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
   
   Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

   Example 1:
   Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
   Result: YES (for 1st variant)
          [1, 3] (for 2nd variant)
   Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.
   
   Example 2:
   Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
   Result: NO (for 1st variant)
   	[-1, -1] (for 2nd variant)
   Explanation: There exist no such two numbers whose sum is equal to the target.

 */

public class twoSum {

    public static String bruteForceTwoSum1(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }

    public static int[] bruteForceTwoSum2(int[] arr, int n, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    // Optimal Approach
    public static String TwoSum(int []arr, int n, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }

    public static int[] TwoSum2(int []arr, int n, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    // Optimized Approach(using two-pointer):
    public static String TwoSum3(int []arr, int n, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

    
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        String ans = bruteForceTwoSum1(arr, arr.length, target);
        System.out.println("This is the answer for variant 1: " + ans);

        int[] res = bruteForceTwoSum2(arr, arr.length, target);
        System.out.println("This is the answer for variant 2: [" + res[0] + ", "
                           + res[1] + "]");

        System.out.println("This is the answer for variant 1: " + TwoSum(arr, arr.length, target));  
        int[] res1 = TwoSum2(arr, arr.length, target);                 
        System.out.println("This is the answer for variant 2: [" + res1[0] + ", "
                           + res1[1] + "]");                   
    
    }
}
