/**
 * longestPalindromicSubstring
 * 
 */
public class longestPalindromicSubstring {

    public static boolean palindromeOfString(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            else if(str.charAt(i) == str.charAt(j)){ 
                i++; 
                j--; 
            }
        }
        return true;
    }

    public static String longestPalindromicSubstringValue(String str) {
        int n = str.length();
        int startIdx = 0;
        int max_len = 1;

        if (n<=1) {
            return str;
        }

        // odd 
        for(int i = 0; i < n; i++) {
            int left = i, right = i;

            while (left>=0 && right<n) {
                if(str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            } 

            int len = right-left-1; 

            if(max_len < len) {
                max_len = len;
                startIdx = left + 1;
            }
        }

        // even
        for(int i = 0; i < n-1; i++) {
            int left = i, right = i + 1;

            while (left>=0 && right<n) {
                if(str.charAt(left) == str.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }

            int len = right-left-1;

            if(max_len < len) {
                max_len = len;
                startIdx = left + 1;
            }
        }
        return str.substring(startIdx, max_len);
    }

    public static void main(String[] args) {
        // System.out.println(palindromeOfString("shaurya")); // false 
        // System.out.println(palindromeOfString("naman")); // true

        System.out.println(longestPalindromicSubstringValue("cbcbbc"));
        System.out.println(longestPalindromicSubstringValue("babad"));
        System.out.println(longestPalindromicSubstringValue("cbxbd"));
    }
}