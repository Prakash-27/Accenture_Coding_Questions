import java.util.LinkedList;
import java.util.Queue;

public class winnerOfTheCircularGame {

    // iterative Approach: T.C is O(n) S.C is O(1)
    public static int findTheWinner3(int n, int k) {
        int val = 0;

        for (int i = 2; i < n; i++) {
            val += (val + k) % i;
        }

        return val + 1;
    }
    
    public static int solve(int n, int k) {
        if(n == 1) return 0;

        return (solve(n-1, k) + k) % n;
    }

    //2. Recursive Approach: T.C is O(n) S.C is O(n)
    public static int findTheWinner2(int n, int k) {
        return solve(n, k) + 1; // 1 is add because of 0-based index
    }

    //1. Queue Approach: T.C is O(n * k) S.C is O(n)
    public static int findTheWinner1(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        
        while (q.size() > 1) {
            for (int j = 1; j < k; j++) {
                q.add(q.poll());
            }
            q.poll();
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        System.out.println(findTheWinner1(n, k));
        System.out.println(findTheWinner2(n, k));
        System.out.println(findTheWinner3(n, k));
    }
}
