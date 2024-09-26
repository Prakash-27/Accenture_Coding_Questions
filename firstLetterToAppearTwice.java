// First Letter to appear twice.

// I/p: String s = "abccbaacz";
// O/p: "c"

import java.util.HashMap;
import java.util.Map;

public class firstLetterToAppearTwice {

    public static void firstLetterAppearTwice(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> hashMap : mp.entrySet()) {
            if (hashMap.getValue() == 3 && hashMap.getKey() == 'c') {
                System.out.println(hashMap.getKey());
            }
        }
    }

    public static char firstLetterAppearTwice1(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }else {
                freq[s.charAt(i) - 'a']++;
            }
        }
        return s.charAt(0);
    }
    
    public static void main(String[] args) {
        String s = "abccbaacz";
        firstLetterAppearTwice(s);
        System.out.println(firstLetterAppearTwice1(s));
    }
}
