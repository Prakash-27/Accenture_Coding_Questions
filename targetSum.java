// Given Array of size N, we have to return the pair whose sum
// is equals to Target and having maximum product.

// Note: first value of pair must be greater than the second one.

// Target = 18
// int[] Arr = {11,1,2,8,10,11,15,7};, N = 8

// Explaination:
// {11,7} {7,11} {10,8} {8,10}
//   ||            ||
//   \/            \/
//   18            18 
//   77            80

//O/p: {10,8}

// Approach:
// - sort the given Array in reverse order (Desending)
// - start from idx start(0) and end(n-1)
// - if(Arr[start] + Arr[end] == target) { update ans; start++; end--; }
// - if(Arr[start] + Arr[end] < target) { end-- }
// - if(Arr[start] + Arr[end]) > Target { start++ }

import java.util.Arrays;
import java.util.Collections;

public class targetSum {

    public static int[] pairSumisEqualToTargetReturnMaxProduct(Integer[] Arr, int N, int target) {
        // to sort array we need to use Wrapper Class to initialize Integer[] Arr
        Arrays.sort(Arr, Collections.reverseOrder());

        int[] ans = new int[2];
        int product = 0;
        
        int start = 0, end = N-1; 

        while (start < end) {
            int sum = Arr[start] + Arr[end];

            if(sum == target) {
                if(product < Arr[start] * Arr[end]) {
                    product = Arr[start] * Arr[end];
                    ans[0] = Arr[start];
                    ans[1] = Arr[end];
                }
                start++;
                end--;
            }
            else if(sum < target) {
                end--;
            } 
            else if(sum > target) {
                start++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Integer[] Arr = {11,1,2,8,10,11,15,7};
        int[] result = pairSumisEqualToTargetReturnMaxProduct(Arr, Arr.length, 18);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
