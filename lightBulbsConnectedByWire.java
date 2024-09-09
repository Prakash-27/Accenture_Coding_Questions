// N light bulbs are connected by a wire. Each bulb has a switch associated with it 
// however due to faulty wiring, a switch also changes the state of all the bulbs to the 
// right of current bulb. Given an initial state of all bulbs. Find the minimum number
// of switches you have to press to press to turn on all the bulbs. You can press the same switch multiple times.

// Note: O represents the bulbs is off and 1 represents the bulb is on.

public class lightBulbsConnectedByWire {
    
    public static int findMinimumNumberOfSwitchesToPressToTurnOnAllBulbs(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(count % 2 == 0) {
                if(arr[i] == 0) count++;
            } else {
                if(arr[i] == 1) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,1};

        System.out.println(findMinimumNumberOfSwitchesToPressToTurnOnAllBulbs(arr, arr.length));
    }
}
