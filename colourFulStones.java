/**
 * There is a sequence of colorful stones. The color of each stone is one of red, green, or blue. You are given a string s. The i-th (1-based) 
 * character of s represents the color of the i-th stone. If the character is "R", "G", or "B", the color of the corresponding stone is red, green, or blue, respectively.

   Initially Squirrel Liss is standing on the first stone. You perform instructions one or more times.
   
   Each instruction is one of the three types: "RED", "GREEN", or "BLUE". After an instruction c, if Liss is standing on a stone whose colors is c, 
   Liss will move one stone forward, else she will not move.
   
   You are given a string t. The number of instructions is equal to the length of t, and the i-th character of t represents the i-th instruction.
   
   Calculate the final position of Liss (the number of the stone she is going to stand on in the end) after performing all the instructions, 
   and print its 1-based position. It is guaranteed that Liss don't move out of the sequence.
   
   Input:
   The input contains two lines. The first line contains the string s (1 ≤ |s| ≤ 50). The second line contains the string t (1 ≤ |t| ≤ 50). 
   The characters of each string will be one of "R", "G", or "B". It is guaranteed that Liss don't move out of the sequence.
   
   Output:
   Print the final 1-based position of Liss in a single line.

   I/p: RGB 
        RRR
   O/p: 2

   I/p: RRRBGBRBBB 
        BBBRR
   O/p: 3

   I/p: BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB
        BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB
   O/p: 15     
 */

// Approach
// - Idx = 0
// - Iterate through the string t.
// - if (t[idx] == s[idx]) idx++;
// - return idx + 1; (1-Based index).

public class colourFulStones {
    
    public static int colorfulStonesOneBasedPosition(String t, String s) {
        int n = t.length();
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
        }

        return idx + 1; // add idx + 1 if the index is 0-based index or if the index is 1-based index return idx.
    }


    public static void main(String[] args) {
        String s = "RGB ";
        String t = "RRR";
        String s1 = "RRRBGBRBBB";
        String t1 = "BBBRR";
        System.out.println(colorfulStonesOneBasedPosition(t, s));
        System.out.println(colorfulStonesOneBasedPosition(t1, s1));
    }
}
