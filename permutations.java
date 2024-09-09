//1. You are given a string S and your task is to find and return the count of permutation formed
// by fixing the positions of the vowels present in the string.

// Note:
//       - Ensure the result is non-negative
//       - If there are no consonants then return 0.

// I/p: s = "abec" => 1. "abec",  2. "aceb"
// O/p: 2

// I/p: s = "ABC" => 1. "ABC",  2. "ACB"
// O/p: 2

public class permutations {

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;

        return n * factorial(n-1);
    }

    // 1.
    public static int countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // (or)  char ch = Character.toLowerCase(str.charAt(i));
            
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                count++;
            }
        }

        return count == 0 ? 0 : factorial(count);
    }


    public static int fact(int n) {
        if(n==0 || n==1) return 1;

        int ans = 1;

        // while (n > 0) {
        //     ans = ans * n;
        //     n--;
        // }

        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    public static int len(String str) {
        int ans = 0;

        for (int i = 0; str.charAt(i) != '\0'; i++) {
            ans++;

            if(i >= 2) {
                break;
            }
        }

        return ans;
    }

    // 2.
    public static int countTheNumberOfPermutationInString(String string) {
        // total length of character
        // total count of repeated character
        

        int arr[] = new int[26];

        for (int i = 0; string.charAt(i) != '\0'; i++) {
            
            int index = (int) string.charAt(i) - 97;
            arr[index]++;

            if(i >= 2) {
                break;
            }
        }

        // total no of repeated character count. 
        int ans = fact(len(string));

        // factorial = total length of character! / total no of repeated character count.!  
        for (int i = 0; i < 26; i++) {
            if(arr[i] > 1) {
                ans = ans / fact(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abec"));
        System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("ABC"));
        System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abcA"));
        System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abcAv"));

        // System.out.println(countTheNumberOfPermutationInString("abc"));
        // System.out.println(countTheNumberOfPermutationInString("aab"));

    }

}
