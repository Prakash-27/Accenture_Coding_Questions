// You are given an array of length n and a index k where 0<k<n. You need to print the absolute
// difference between the sum of element to the left of index k and sum of elements to the right.

//I/p: int[] arr = {1,2,3,4,5,6,7,8,9,10}; k = 4, N = 10
//O/p: 10 - 40 = -30 Math.abs(-30) => 30

public class absoluteDifferenceBetweenLeftAndRightSideOfGivenArray {

    public static int sumOfLeftAndRightSideOfArrayAndDifferenceIt(int[] arr, int N, int k) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            if(i < k) sum1 += arr[i];
            if(N-i-1 > k) sum2 += arr[N-i-1];
        }

        int absoluteDifference = sum1 - sum2;

        return Math.abs(absoluteDifference);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 4;
        System.out.println(sumOfLeftAndRightSideOfArrayAndDifferenceIt(arr, arr.length, k));
    }
}
