// find Character C Occurrences In A Given String

// Input: String str = "shaurya";

// Ouput: C = "a" => 2

public class findCharacterCOccurrencesInAGivenString {
    
    public static int findCOccurrences(String str, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "shaurya";
        System.out.println(findCOccurrences(str, str.length()));
    }
}
