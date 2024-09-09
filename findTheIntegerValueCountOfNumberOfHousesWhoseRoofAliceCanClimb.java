// Alice has a pair of magical shoes that allows her to climb 3 stairs at once. In the city there are 
// N houses whose roof Alice want to reach. The numbers of roofs of each house is given in an
// array A. Alice can reach the roof of only those houses where the number is a multiple of 3.
// Your task is to find and return integer value representing the count of the number of houses whose roof Alice can climb.

// Input: A[] = {12, 16, 21, 20}, N = 4, Output: 2
// Input: B[] = {6}, N = 1, Output: 1

public class findTheIntegerValueCountOfNumberOfHousesWhoseRoofAliceCanClimb {
    
    public static int findTheIntegerValueCountOfNumberOfHousesRoofAliceCanClimb(int[] A, int N) {
        if(N < 1) return 0;

        int count = 0;

        for(int i = 0; i < N; i++) {
            if(A[i] % 3 == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int A[] = {12, 16, 21, 20};
        int B[] = {6};
        int C[] = {1,2,3,4,5,6,7,9};
        System.out.println(findTheIntegerValueCountOfNumberOfHousesRoofAliceCanClimb(A, A.length));
        System.out.println(findTheIntegerValueCountOfNumberOfHousesRoofAliceCanClimb(B, B.length));
        System.out.println(findTheIntegerValueCountOfNumberOfHousesRoofAliceCanClimb(C, C.length));
    }

}
