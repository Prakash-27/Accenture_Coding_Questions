//1. You are given a string S and your task is to find and return the count of permutation formed
// by fixing the positions of the vowels present in the string.

// Note:
//       - Ensure the result is non-negative
//       - If there are no consonants then return 0.

// I/p: s = "abec" => 1. "abec",  2. "aceb"
// O/p: 2

// I/p: s = "ABC" => 1. "ABC",  2. "ACB"
// O/p: 2

public class permutations1 {

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

    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;

        return n * factorial(n-1);
    }

    // 1.
    public static int countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString(String str) {
        int count = 0;
        int y = 0;
        int b = 0;
        int h = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // (or)  char ch = Character.toLowerCase(str.charAt(i));

            if(ch == 'y') {
                y++;   
            } else if(ch == 'b') {
                b++;
            } else if(ch == 'h') {
                h++;
            }
            
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                count++;
            }
        }

        return count == 0 ? 0 : factorial(count);

        // countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("ybghjahebuyitob")
        // return count == 0 ? 0 : factorial(count)/factorial(y) * factorial(b) * factorial(h);

        // countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abbced")
        // return count == 0 ? 0 : factorial(count)/factorial(b);
    }

    public static void main(String[] args) {
        // System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abec"));
        // System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("ABC"));
        // System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abcA"));
        // System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abcAv"));

        // System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("ybghjahebuyitob"));
        // total numbers without vowels is 10 (including repeated)
        // y is repeating 2 times 
        // b is repeating 3 times 
        // h is repeating 2 times 

        // formula is factorial => 10!/2! 3! 2!

        System.out.println(countOfPermutationFormedByFixingThePositionsOfTheVowelsPresentInTheString("abbced"));

    }

}
