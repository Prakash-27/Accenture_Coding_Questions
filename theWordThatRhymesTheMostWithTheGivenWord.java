// Given an array String arr = {"gender", "blender", "blunder", "under"}
// Input string is "thunder". From the array return the word that rhymes the most with the given
// word And if two words rhymes the most then return the word with less character count.
// (example in blunder and under, the output will be "under").

// I/p: N = 4, Arr[] = {"gender", "blender", "blunder", "under"}, given input = "thunder";
// O/p: "under"

// Approach:
// for the word that rhymes the most we have to check the longest common suffix.

// 1. iterate through out the Array.
// 2. check for each string and update the answer


public class theWordThatRhymesTheMostWithTheGivenWord {
   
    private static int longestCommonSuffix(String word, String input) {
        int i = word.length() - 1;
        int j = input.length() - 1;
        int length = 0;

        while (i >= 0 && j >= 0 && word.charAt(i) == input.charAt(j)) {
            length++;
            i--;
            j--;
        }

        return length;
    }

    public static String returnWordWithLessCharacterCountIfTwoWordsRhymesTheMost(String[] arr, int n, String input) {
        String answer = "";
        int maxSuffixLength = 0;

        for (String word : arr) {
            int currentSuffixLength = longestCommonSuffix(word, input);

            if (currentSuffixLength > maxSuffixLength || currentSuffixLength == maxSuffixLength && word.length() < answer.length()) {
                answer = word;
                maxSuffixLength = currentSuffixLength;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"scooter", "monitor", "greater", "shutter"};
        String input = "matter";
        String[] arr1 = {"gender", "blender", "blunder", "under"};
        String input1 = "thunder";

        System.out.println(returnWordWithLessCharacterCountIfTwoWordsRhymesTheMost(arr, arr.length, input));
        System.out.println(returnWordWithLessCharacterCountIfTwoWordsRhymesTheMost(arr1, arr1.length, input1));
    }

}