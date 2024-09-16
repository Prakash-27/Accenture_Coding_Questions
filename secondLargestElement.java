// Count the frequency of second largest element.

// example:
// I/p: int[] Arr = {1,2,2,3,2,3};, N = 6
// O/p: 3

public class secondLargestElement {
    
    public static int secondLargestNumberFromArray(int[] Arr, int N) {
        // there should be atleast two elements
        if (N < 2) {
            return -1;
        }            

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        // {1,2,2,3,2,3};

        for (int i = 0; i < N; i++) {
            // If current element is smaller than first then update both first and second
            if(Arr[i] > largest) {
                secondLargest = largest;
                largest = Arr[i];
            } 
            // If Arr[i] is in between first and second then update second
            else if(Arr[i] > secondLargest && Arr[i] != largest) {
                secondLargest = Arr[i];
            }
        }
       return secondLargest;
    }

    public static int countSecondLargestElement(int[] Arr, int N) {
        int count = 0;
        int secondLargest = secondLargestNumberFromArray(Arr, N);

        for (int i = 0; i < N; i++) {
            if(Arr[i] == secondLargest) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] Arr = {1,2,2,3,2,3};
        System.out.println(secondLargestNumberFromArray(Arr, Arr.length));
        System.out.println(countSecondLargestElement(Arr, Arr.length));
    }
}
