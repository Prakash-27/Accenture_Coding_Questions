// Print the second smallest number from an Array.

// I/p: int[] Arr = {5,4,2,1,3};
// O/p: 2

// Approach:
// Take two buckets min, min2
// if (Arr[idx] < min) { // update both
//   min2 = min
//   min = Arr[idx]
//}
// if (Arr[idx] < min2) { // update min2
//   min2 = Arr[idx] 
//}

public class findSecondSmallestNumberFromAnArray {

    public static int secondSmallestNumberFromArray(int[] Arr, int N) {
        // there should be atleast two elements
        if (N < 2) {
            return -1;
        }            

        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        // [5,4,2,1,3];

        for (int i = 0; i < N; i++) {
            // If current element is smaller than first then update both first and second
            if(Arr[i] < first) {
                second = first;
                first = Arr[i];
            } 
            // If Arr[i] is in between first and second then update second
            else if(Arr[i] < second && Arr[i] != first) {
                second = Arr[i];
            }
        }

       return second;
    }

    public static void main(String[] args) {
        int[] Arr = {5,4,2,1,3};
        int[] Arr1 = {5,4};
        int[] Arr2 = {5};
        int[] Arr3 = {1,2,3,4,5};
        System.out.println(secondSmallestNumberFromArray(Arr, Arr.length));
        System.out.println(secondSmallestNumberFromArray(Arr1, Arr1.length));
        System.out.println(secondSmallestNumberFromArray(Arr2, Arr2.length));
        System.out.println(secondSmallestNumberFromArray(Arr3, Arr3.length));
    }
}
