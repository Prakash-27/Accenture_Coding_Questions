// Given an Array A of size N where A[i] represents minutes, count the number of pairs whose sum represents any full hour.
// As the count be very larger, print count modulus(%) 10^9 + 7, if no such pair can be formed, then print "No Hours".

// Note: no pair can be formed if N - 1;

// I/p: arr = {1,59,30,30}, N = 4.
// O/p: 2

// I/p: arr = {2,2,58,60,60}, N = 5.
// O/p: 3

import java.util.HashMap;
import java.util.Map;

public class hourCount {

    // bruteforce Approach
    public static int hoursCount(int[] arr) {
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
               sum = arr[i] + arr[j];
               if(sum%60 == 0) {
                   count++;
               } 
               else if(sum%60 != 0) {
                   continue;
               }
            }
       }
        return count;
    }

    public static String hoursCountOptimizedApproach(int[] arr, int n) {
        int answer = 0;
        int mod = (int) Math.pow(10, 9) + 7; // 10^9 + 7

        Map<Integer, Integer> hashMap = new HashMap<>(); 

        for(int i = 0; i < n; i++) {
            int a;
            if(arr[i]%60 == 0 && arr[i] != 0) {
                a = 60;
            } else {
                a = arr[i]%60;
            }

            int b = 60 - a;

            if(hashMap.containsKey(b)) {
                answer = (answer + hashMap.get(b)) % mod;
            }

            hashMap.put(a%60, hashMap.getOrDefault(a%60, 0) + 1);

        }
        return (answer == 0) ? "No Hours" : Integer.toString(answer);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,59,30,30};
        int[] arr1 = {2,2,58,60,60};
        System.out.println(hoursCount(arr)); // 2
        System.out.println(hoursCountOptimizedApproach(arr, arr.length)); // 2
        System.out.println(hoursCount(arr1)); // 3
        System.out.println(hoursCountOptimizedApproach(arr1, arr1.length)); // 3
    }
}
