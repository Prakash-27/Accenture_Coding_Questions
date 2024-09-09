// You are given an array of size N, You have to find the length of longest subsequence, 
// In Which the difference of every consecutive element is divisible by k.

// Input => First line having 2 Integer N,K (N is size of array)
//          Next line contain N integers representing array.

// o/p =>  Single Integer. (length of longest subsequence difference divisible by K)

// Input => N = 3  arr = {1, 1, 2}
        //  K = 3

// Input => N = 2  arr = {2, 4}
        //  K = 2


public class longestSubsequenceWithDifferenceOfEveryConsecutiveElementDivisibleByK {
    
    // static int maxi = 0;

    // public static void solve(int idx, int[] temp, int[] arr, int k) {
    //     if(idx == arr.length) {
    //         if(maxi < temp.length) {
    //             maxi = temp.length;
    //         }
    //         return;
    //     }

    //     if(temp.length == 0 || (arr[idx] - temp[temp.length-1]) % k == 0) { // pick
    //        temp[idx] =  arr[idx];
    //        solve(idx+1, temp, arr, k);
    //        temp[idx] = 0;
    //     }

    //     solve(idx, temp, arr, k); // not pick
    // }

    

    public static int longestSubsequence(int[] arr, int n, int k) {
        int count = 1;
        int max = 0;
        for(int i = 0; i < n-1; i++) {
            if(Math.abs(arr[i] - arr[i+1]) % k == 0) {
                count++;
            } else {
                count = 1;
            }

            if (max < count) {
                max = count;
            }
        }
        if (max==1) {
            return 0;
        } else {
            return max;
        }
    }

    public static int longestSubsequenceTriple(int[] arr, int n){
        int count = 1;
        // int max = 0;
        for (int i = 0; i < n; i++) {
            int j=i+1;
           while (j<n) {
            if (arr[i]*3==arr[j]) {
                
                count++;
            }
            j++;
           }
           
        }

        return count;

    }


    public static void main(String[] args) {
        // int n = 3;
        // int k = 3;

        // int arr[] = {1,1,2};
        // int temp[] = new int[3];

        // for(int i = 0; i < n; i++) {
        //     arr[i] = arr[i];
        // }

        // int idx = 0;

        // solve(idx, arr, temp, k);

        // System.out.println(maxi);

        int arr[] = {1,1,2};
        int arr1[] = {2,4,6,18};

        // longestSubsequenceWithDifferenceOfEveryConsecutiveElementDivisibleByK ls = new longestSubsequenceWithDifferenceOfEveryConsecutiveElementDivisibleByK();
        // int result = ls.longestSubsequence(arr, 3, 3);
        // int result1 = ls.longestSubsequence(arr1, 2, 3);
        // System.out.println(result);
        // System.out.println(result1);

        System.out.println(longestSubsequence(arr1, 2, 3));
        System.out.println(longestSubsequenceTriple(arr1, 4));
    }


}
