public class reverseInteger {
    public static int[] ReverseInteger(int[] Arr, int N) {
        for(int idx = 0; idx < N/2; idx++) {
            int temp = Arr[idx];
            Arr[idx] = Arr[N - idx - 1];
            Arr[N - idx - 1] = temp;
        }
        return Arr;
    } 

    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,1,2,0,1,2,3};
        int[] Arr2 = ReverseInteger(Arr, Arr.length);

        for (int i = 0; i < Arr2.length; i++) {
            System.out.print(Arr2[i]+ " ");
        }
    }
}
