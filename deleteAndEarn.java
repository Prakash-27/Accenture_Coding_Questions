// (Same as delete and Earn Problem in (Leetcode))
// (Same as Boredom Problem in (codeforces))

// This is look like Greedy Problem (for maximize the number of points) but it is not Greedy it is normal Dp Problem.
// This Problem is same as House and Robber Problem in (Leetcode) it is Dynamic Programming Problem

// Question
// You are given an integer array nums. You want to maximize the 
// number of points you get by performing the following operation any
// number of times:

// Pick any nums[i] and delete it to earn nums[i] points.
// Afterwards, you must delete every element equal to nums[i]-1
// and every element equal to nums[i] + 1.

// Return the maximum number of points you can earn by applying
// the above operation some number of times.

// Ex:
// I/p: int[] nums = {3,4,2};
// O/p: 6

// I/p: int[] nums1 = {2,3,3,3,4};
// O/p: 9

// I/p: int[] nums2 = {3,3,4,4,4,5,5};
// O/p: 16

// Explanation: 
// you can perform the following operations:
// - Delete 4 to earn 4 points. Consequently, 3 is also deleted, nums = {2}.
// - Delete 2 to earn 2 points, nums = {}, you earn a total of 6 points.

import java.util.Arrays;
import java.util.HashMap;

public class deleteAndEarn {
    // This is bottom Up Approach
    public static int deleteAndEarnAtlastTotalNoOfEarnedPoints(int[] nums) {
        int N = nums.length;
        // int max = Arrays.stream(nums).max().getAsInt();
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        HashMap<Integer, Integer> val = new HashMap<>();

        for (int i : nums) {
            val.put(i, val.getOrDefault(i, 0) + i);
        }

        int pick = val.getOrDefault(1, 0);

        int notpick = 0;

        for (int i = 2; i <= max; ++i) {
            int newPick = notpick + val.getOrDefault(i, 0);
            int newNotpick = Math.max(pick, notpick);
            notpick = newNotpick;
            pick = newPick;    
        }

        return Math.max(pick, notpick);
    }
    
    public static void main(String[] args) {
        int[] nums = {3,4,2};
        int[] nums1 = {2,3,3,3,4};
        int[] nums2 = {3,3,4,4,4,5,5};
        
        System.out.println(deleteAndEarnAtlastTotalNoOfEarnedPoints(nums));
        System.out.println(deleteAndEarnAtlastTotalNoOfEarnedPoints(nums1));
        System.out.println(deleteAndEarnAtlastTotalNoOfEarnedPoints(nums2));
    }
}
