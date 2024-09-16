// We are given an Array which represents the temperature of
// different Days. We have to return an integer that 
// represents the longest consecutive temperature drop.

// I/p: int[] Arr = {1,6,0,-1,-2,3,4,8}; N = 8
// O/p: 3 (6 to 0, 0 to -1, -1 to -2) temperature drop.

public class temperatureOfDifferentDays {
    
    public static int theLongestConsecutiveTemperatureDrop(int[] Arr, int N) {
        int count = 0;
        int tempDropcount = 0;

        for (int i = 1; i < N; i++) {
            if(Arr[i] < Arr[i-1]) count++;
            else {
                if(count > tempDropcount) {
                    tempDropcount = count;
                }
                count = 0;
            }
        }
        return tempDropcount;
    }

    public static void main(String[] args) {
        int[] Arr = {1,6,0,-1,-2,3,4,8};
        System.out.println(theLongestConsecutiveTemperatureDrop(Arr, Arr.length));
    }

}
