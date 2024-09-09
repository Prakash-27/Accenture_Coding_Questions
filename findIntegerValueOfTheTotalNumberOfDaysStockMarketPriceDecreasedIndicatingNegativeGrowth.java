/**
 * You are working on a financial analysing tool which represents daily stock prices of a 
 * company over time. Each element in an integer array A of size N represents the closing price
 * of the stock for that particular day. Your task is to find and return an integer value 
 * representing the total number of days where the stock market price decreased indicating
 * negative growth.
 * 
 * Input: A[] = {2,3,1,4,5,2}, N = 6 
 * Output: 2
 * 
 * Input: A[] = {6}, N = 1
 * Output: 0
 */

public class findIntegerValueOfTheTotalNumberOfDaysStockMarketPriceDecreasedIndicatingNegativeGrowth {

    public static int findTotalNumberOfDaysStockMarketPriceDecreasedNegativeGrowth(int[] A, int N) {

        if(N <= 1) return 0;

        int count = 0;

        for(int i = 0; i < N-1; i++) {
            if(A[i] > A[i+1]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int A[] = {2,3,1,4,5,2};
        int B[] = {6};
        int C[] = {1,2,1,3,2};
        System.out.println(findTotalNumberOfDaysStockMarketPriceDecreasedNegativeGrowth(A, A.length));
        System.out.println(findTotalNumberOfDaysStockMarketPriceDecreasedNegativeGrowth(B, B.length));
        System.out.println(findTotalNumberOfDaysStockMarketPriceDecreasedNegativeGrowth(C, C.length));
    }
    
}