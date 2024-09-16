// You are given a string as which contains the moves played by the players. Sequentially in a
// game called snake water gun. The rules of the game are as follows.

// Snake beats water, water beats gun and gun beats snake.

// The move played by player, A and move played by player B in the first round will be stored in 
// the string as "snakewater".

// Similarly, in the second round, the moves will be stored in a string as "snakewatergunsnake"

// There are total N rounds that are played in the game and your task is to find and return an 
// integer value representing how many rounds player A wins.

// Note: the given string is in lowercase.

// I/p: String str = "snakewatergunwater";

public class snakeWaterGun {
    
    public static int findPlayerAWinCount(String str, int n) {
        String A = "", B = "";
        String word = "";
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            word = word + str.charAt(i);

            if(word.equals("snake")) {
                if(flag) B = B + "s";
                else A = A + "s";

                flag = !flag;
                word = "";
            } 
            else if (word.equals("water")) {
                if(flag) B = B + "w";
                else A = A + "w";

                flag = !flag;
                word = "";
            } 
            else if (word.equals("gun")) {
                if(flag) B = B + "g";
                else A = A + "g";

                flag = !flag;
                word = "";
            } 
        }
        System.out.print("A: " + A + " ");
        System.out.println("B: " + B);

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (B.charAt(i) == 's' && A.charAt(i) == 'g' || B.charAt(i) == 'w' && A.charAt(i) == 's' || 
            B.charAt(i) == 'g' && A.charAt(i) == 'w') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "snakewatergunwater";
        String str1 = "snakewatersnakegun";
        System.out.println(findPlayerAWinCount(str, 2));
        System.out.println(findPlayerAWinCount(str1, 2));
    }
}
