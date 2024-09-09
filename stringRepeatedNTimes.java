// You are given an Integer N and String S. Your Task is to find and return new string 
// which consist of the original string repeated N times.

// Input: N, string            Output: String.

// Input: str = "ABC", n = 3,  Output: "ABCABCABC"

public class stringRepeatedNTimes {
    
    public static String repeatedNTimesString(String str, int n) {
        String answer = "";
        while (n > 0) {
            answer = answer + str;
            n--;
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(repeatedNTimesString(str, str.length()));
    }

}
