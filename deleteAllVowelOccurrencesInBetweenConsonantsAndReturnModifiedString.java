// Input a string S. Delete all the vowel occurrences in that string which occur only between the 
// consonants and return the modified string.

// I/p: "applesarefallingfromtheskies"
// O/p: "applsrfllngfrmthskies"

public class deleteAllVowelOccurrencesInBetweenConsonantsAndReturnModifiedString {
    
    private static boolean isVowel(char ch) {
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static String returnModifiedString(String str, int n) {
        char[] s = str.toCharArray();

        String ans = "";

        ans += s[0];

        for (int i = 1; i < n-2; i++) {
            if (isVowel(s[i]) && !isVowel(s[i-1]) && !isVowel(s[i+1])) {
                continue;
            }
            else {
                ans += s[i];
            }
        }

        ans += s[n-1];

        return ans;
    }

    public static void main(String[] args) {
        String str = "applesarefallingfromtheskies";
        String str1 = "abcdefgh";

        System.out.println(returnModifiedString(str, str.length()));
        System.out.println(returnModifiedString(str1, str1.length()));
    }
}
