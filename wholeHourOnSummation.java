// (same as 2-sum problem in leetcode)

// An array of minutes are given. We have to count the no.of pairs that form a whole hour on summation.

// I/p: int[] arr = {2,58,58,2,60,60};

// no any fixed target 
// we have to calculate.

// Target calculation:

// Target hour = ((min/60) + 1)
// Target min = (Target hour) * 60
//            = (min/60 + 1) * 60

import java.util.HashMap;
import java.util.Scanner;

public class wholeHourOnSummation {

    public static int solve(int[] arr, int n) {
        int count = 0;
        HashMap<Integer, Integer> hp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int minute = arr[i];
            int targetHours = (minute/60) + 1; 
            
            int targetMinutes = targetHours * 60;

            int req = targetMinutes - minute;

            if(hp.containsKey(req)) {
                count += hp.get(req);
                hp.put(req, 0);
            } 
            else {
                hp.put(arr[i], hp.getOrDefault(arr[i], 0) + 1);
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = scanner.nextInt();
        // }
        int[] arr = {2,58,58,2,60,60};

        System.out.println(solve(arr, arr.length));
        // scanner.close();
    }
}
