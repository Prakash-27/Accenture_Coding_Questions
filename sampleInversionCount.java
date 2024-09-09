import java.util.*;

public class sampleInversionCount {
    
    public static int BruteForceApproachNumberOfInversionCount(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

//---------------------------------------------------------------------------------------------------------

    public static int merges(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
    
        int count = 0;
    
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else if (arr[right] <= arr[left]) {
                temp.add(arr[right]);
                count += mid - left + 1;
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
    
        return count;
    }
    
    public static int mergeSorts(int[] arr, int low, int high) {
       int count = 0;
    
       if (low >= high) {
           return count;
       }
       int mid = (low + high) / 2; 
       count += mergeSorts(arr, low, mid);
       count += mergeSorts(arr, mid + 1, high);
       count += merges(arr, low, mid, high);
    
       return count;
    }

    public static int OptimizedNumberOfInversionCount(int[] a, int n) {
        return mergeSorts(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 3, 2, 1 };
        int n = array.length;

        int count = OptimizedNumberOfInversionCount(array, n);
        System.out.println("The numbers of inversion is: " + count);

        int $count = BruteForceApproachNumberOfInversionCount(array, n);
        System.out.println("The numbers of inversion is: " + $count);
        
    }

}
