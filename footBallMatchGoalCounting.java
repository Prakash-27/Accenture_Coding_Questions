// A football match is ongoing, and every time a team scores, their name is recorded on a scoreboard. The names are
// either "TeamA" or "TeamB", depending on which team scored the goal, Once the match ends, your task is to 
// determine which team scored more goals.

// I/p: - A string containing the sequence of goals recorded, with each goal labeled as either "TeamA" or "TeamB".
// I/p: "TeamA TeamB TeamA TeamA TeamB TeamA"

// Output: - The name of the team that scored more goals.

public class footBallMatchGoalCounting {
    
    public static String countTeamScoredMoreGoals(String str) {
        int A = 0;
        int B = 0;

        for(int i = 4; i < str.length(); i+=6) {
            if (str.charAt(i) == 'A') {
                A++;
            }
            else {
                B++;
            }
        }
        return (A > B) ? "TeamA" : "TeamB";
    }

    public static void main(String[] args) {
        String str = "TeamA TeamB TeamA TeamA TeamB TeamA";
        System.out.println(countTeamScoredMoreGoals(str)); // TeamA
    }
}
