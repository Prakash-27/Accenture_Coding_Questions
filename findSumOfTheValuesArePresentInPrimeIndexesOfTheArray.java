// Given an array with 'N' elements, you are expected to find the sum of the values that are 
// present in prime indexes Of the array. Note that the array index starts with 0 i.e the position
// (index) on the first array element is 0, the position of the next array element is 1 and so on.

// example: Arr[] = {10,20,30,40,50,60,70,80,90,100}, N = 10

public class findSumOfTheValuesArePresentInPrimeIndexesOfTheArray {
    
    private static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }

        for (int i = 2; i < N; i++) {
            if(N % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfValuesPresentInPrimeIndexesOfArray(int[] Arr) {
        int sum = 0;

        for (int i = 0; i < Arr.length; i++) {
            if (isPrime(i)) {
                sum += Arr[i];
            }
        }

        return sum;
    }    

    public static void main(String[] args) {
        int Arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(sumOfValuesPresentInPrimeIndexesOfArray(Arr));
    }

}
