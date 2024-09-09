// Two players A and B are playing the game of Rock, paper and scissors. 
// Player A chooses a move represented by String M and the move can be one of the following:
// Rock paper or scessors
// where 1 - Rock beats scissors
//       2 - scissors beats paper
//       3 - paper beats Rock

// your task is to find and return a string value representing the winning move for B.

public class rockPaperScissors {
    
    public String rPS(String str) {
        if (str == "Rock") {
            return "Paper";
        } else if (str == "Scissor") {
            return "Rock";
        } else if (str == "Paper") {
            return "Scissor";
        } else {
            return "Given value is not valid";
        }
    }

    public static void main(String[] args) {
        rockPaperScissors rps = new rockPaperScissors();
        System.out.println(rps.rPS("Rock"));
        System.out.println(rps.rPS("Paper"));
        System.out.println(rps.rPS("Scissor"));
        System.out.println(rps.rPS("Knife"));
    }
}
