// You are given a string which contains some consonants and vowel in lowercase letters. you need
// to print the maximum frequency of all the vowels present in the String.

// I/p: String str = "shaurya";

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maximumFrequencyOfAllTheVowelsPresentInTheString {

    private static boolean isVowel(char ch) {

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'u');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Map<Character, Integer> hp = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))) {
                hp.put(str.charAt(i), hp.getOrDefault(str.charAt(i), 0) + 1);
            } 
        }

        for (Map.Entry<Character, Integer> hash : hp.entrySet()) {
            System.out.println(hash.getKey() + "-" + hash.getValue());
        }
    }
}
