import java.util.Arrays;

// Your daughter, Alex, has just come home with a bag full of candy after a long night of trick-or-treating, 
// Before going to sleep, Alex places the candy in numPiles piles with i-th pile containing candyPiles[i] number of candies.

// After arranging the candies into piles, Alex announces she is going to sleep for numHours hours.

// Your plan is to eat all the candy before Alex wakes up in numHours. You can eat c candies per hour, but in each hour you will
// only eat candy from a single pile. If a pile contains fewer than C candies, you will only eat the number of candies in that 
// pile and you will wait until the next hour to eat more candy.

// Having a little bit of self-restraint your goal is to calculate the smallest number of candies C you need to eat per hour in order
// to finish all the candy before Alex wakes up again.

// Input Format:
// The first line of the input will be an integer, numPiles.
// The next numPiles lines of the input will represent candyPiles with each line representing the number of candies in that pile.
// The last line of the input will be a string representation of an integer representing the number of hours, numHours, that Alex will be asleep for.

// Output Format:
// The output will be an integer, representing the smallest number of candies (C) that you need to eat per hour in order to finish all the candies before Alex wakes up.

// I/p: int[] arr = {4,9,11,17};, N = 4, h = 8
// O/p: 6

public class halloweenCandy {
    
    public static int solve(int[] arr, int n,  int h) {

        int low = 1;
        int high = Math.max(arr[0], arr[3]);

        int c = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high)/2;
            int required_h = 0;

            for (int i = 0; i < n; i++) {
                required_h += (arr[i] + mid - 1)/mid;
            }

            if (required_h > h) {
                low = mid+1;
            }
            else if(required_h <= h) { // valid ans
                c = mid;
                high = mid-1; // in search of lesser c value.
            }
        }
        return c;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = high;

        while (low <= high) {
            int k = (low + high) / 2;

            int totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                res = k;
                high = k - 1;
            } else {
                low = k + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,9,11,17};
        int h = 8;
        System.out.println(solve(arr, arr.length, h));

        System.out.println(minEatingSpeed(arr, h));
    }
}
