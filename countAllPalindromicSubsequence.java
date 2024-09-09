/**
 * countAllPalindromicSubsequence
 * 
 * Count All Palindromic subsequence in a given string.
 * 
 * example:
 * --------
 * I/p: str = "abcd"
 * O/p:  4
 */


public class countAllPalindromicSubsequence {


    public static int countAllPalindromicSubsequenceValue(String str, int i, int j) {
        if (i == j) {
            return 1;
        }

        if (j < i) {
            return 0;
        }

        if (str.charAt(i) == str.charAt(j)) {
            return 1 + countAllPalindromicSubsequenceValue(str, i+1, j) + countAllPalindromicSubsequenceValue(str, i, j-1);
        } 
        else {
            return countAllPalindromicSubsequenceValue(str, i+1, j) + countAllPalindromicSubsequenceValue(str, i, j-1) - countAllPalindromicSubsequenceValue(str, i+1, j-1);
        }
    }


    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(countAllPalindromicSubsequenceValue(str, 0, str.length()-1));
    }
    
}