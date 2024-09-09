// You are on a hiking trail represented by an Array A of length N. where the trial initially ascends
// and then descends forming a single peek. Your task is to find and return an integer value representing the elevation of the summit.
// Input: N, Arr[] | Output: Int (elevation of summit)

// ex: I/p: N = 7, Arr = [1,2,3,4,3,2,1]
//     O/p: 4

// I/p: N = 2, Arr = [5,3]
// O/p: 5

public class findPeakOfSummit {
    
    public static int elevationOfSummit(int[] Arr, int N) {
        if (N == 0) return -1;

        if(N == 1) return Arr[0];

        // case 1: {1,2,3,4,5} ascends 
        if(Arr[N-1] > Arr[N-2]) return Arr[N-1];

        // case 2: {4,3,2,1} decends
        if(Arr[0] > Arr[1]) return Arr[0];

        // case: 3 {1,2,3,4,3,2,1} full ascends and decends summit
        //            i       N-1
        for(int i = 1; i < N-1; i++) {
            if(Arr[i] > Arr[i+1]) return Arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int Arr[] = {1,2,3,4,3,2,1};
        System.out.println(elevationOfSummit(Arr, Arr.length));
        int Arr1[] = {1,2,3,4,5};
        System.out.println(elevationOfSummit(Arr1, Arr1.length));
        int Arr2[] = {4,3,2,1};
        System.out.println(elevationOfSummit(Arr2, Arr2.length));
    }
}
