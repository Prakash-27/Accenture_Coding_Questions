import java.util.*;

public class sample {
    
    public static void merges(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else if (arr[right] <= arr[left]) {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSorts(int[] arr, int low, int high) {
       if (low >= high) {
           return;
       }
       int mid = (low + high) / 2; 
       mergeSorts(arr, low, mid);
       mergeSorts(arr, mid + 1, high);
       merges(arr, low, mid, high);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int array[] = { 9, 4, 7, 6, 3, 1, 5 };
        int n = array.length;

        System.out.println("Before sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sample.mergeSorts(array, 0, n - 1);

        System.out.println("After sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
