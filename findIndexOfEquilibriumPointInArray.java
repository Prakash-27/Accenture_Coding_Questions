// The function accepts an integer array 'arr' of size 'n' as it argument. The function needs to 
// return the index of an equlibrium point in the array. where the sum of elements on the left
// of the index is equal to the sum of elements on the right of the index. If no equilibrium point
// exists return -1.

// I/p: arr[] = {-7,1,5,2,-4,3,0}, n = 7
// O/p: 3

public class findIndexOfEquilibriumPointInArray {

    public static int findIndexOfEquilibrium(int[] Arr, int n) {
        int pre[] = new int[n];
        int suf[] = new int[n];

        pre[0] = Arr[0]; // pre first value is equal to Arr of first value
        suf[n-1] = Arr[n-1]; // suf last value is equal to Arr of last value

        for(int i = 1; i < n; i++) {
            pre[i] = Arr[i] + pre[i-1];
            suf[n-i-1] = Arr[n-i-1] + suf[n-i];
        }

        for(int i = 0; i < n; i++) {
            if(pre[i] == suf[i]) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int Arr[] = {-7,1,5,2,-4,3,0};
        System.out.println(findIndexOfEquilibrium(Arr, Arr.length));
    }
    
}