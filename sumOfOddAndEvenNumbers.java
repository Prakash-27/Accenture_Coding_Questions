// Print the sum of odd numbers and even numbers respectively in a given Array.

// I/p: int[] arr = {1,2,3,6,10,11,13,21,5,4};

public class sumOfOddAndEvenNumbers {

    public static int sumOfEven(int[] arr, int n) {
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } 
        }
        return even;
    }

    public static int sumOfOdd(int[] arr, int n) {
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                odd += arr[i];
            } 
        }
        return odd;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,10,11,13,21,5,4};
        System.out.println(sumOfEven(arr, arr.length));
        System.out.println(sumOfOdd(arr, arr.length));
    }
}
