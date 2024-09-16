// You are playing a game of Toss and Score in the Hillwood City Mall with your friends.
// The game consists of the following rules:
// - Toss an unbiased coin multiple times.
// - For each heads you get 2 points and for each tails you lose 1 point.
// - The game ends as soon as you get 3 heads in a row, or you toss the coin throughtout the length of string S.

// You have been given a string S consisting of letters H (for heads) and T (for tails)
// sequence of result. Your task is to find and results you get on the toss of coin N
// integer value representing the final score you get once the game ends.

// Note: final answer can be negative too.

// I/p: String str = "HTHHTTHTHHHT";

// O/p: 10

public class tossAndScore {
    
    public static int retutnScoreOfHeads(String str, int n) {
        int count = 0;
        int score = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'H') {
                score += 2;
                count++;
            } else if(str.charAt(i) == 'T') {
                score -= 1;
                count = 0;
            }
            if(count == 3) return score;
        }

        return score;
    }

    public static void main(String[] args) {
        String str = "HTHHTTHTHHHT";
        System.out.println(retutnScoreOfHeads(str, str.length()));
    }
}
