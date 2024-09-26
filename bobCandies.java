// Bob goes to super market to shop candies represented by an array A for halloween party, his
// mother gave him some money M. Due to the festive season. there are several offers in the 
// supermarket, One such offer useful for Bob is, if the price of the candy is a multiple of 5,
// he can buy it without spending any money otherwise he will spend money equal to A[i] which is 
// the price of a particular candy, Bob can shop as long as he has money, Your task is to find and 
// return the maximum number of candies Bob can buy.

// I/p: int[] arr = {5,5,105};, N = 3, M = 16
// O/p: 3

// I/p: int[] arr1 = {6,4,1,15,5};, N = 5, M = 5
// O/p: 4


public class bobCandies {

    public static int maximumNumberOfCandiesBobCanBuy(int[] arr, int N, int M) {
        int count = 0;

        for (int index = 0; index < N; index++) {
            if(arr[index] % 5 == 0) count++;
            else if(arr[index] <= M) {
                count++;
                M = M - arr[index];
            }
            else if(arr[index] > M) {
                continue;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,5,105};
        int[] arr1 = {6,4,1,15,5};

        System.out.println(maximumNumberOfCandiesBobCanBuy(arr, arr.length, 16));
        System.out.println(maximumNumberOfCandiesBobCanBuy(arr1, arr1.length, 5));
    }
}
