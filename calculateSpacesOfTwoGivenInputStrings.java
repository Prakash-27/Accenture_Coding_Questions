// Calculate spaces of two given input strings and return a string with whether their difference is odd or even with ":" and count

// example:
// I/p: "abc bcd cda"
// I/p: "abc bc"

// Output: "Odd: 1"

public class calculateSpacesOfTwoGivenInputStrings {

    public static String returnAStringsDifferenceIsOddOrEven(String s1, String s2) {
        int A = 0, B = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') A++;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') B++;
        }

        int difference = Math.abs(A-B);

        if (difference % 2 == 0) {
            return "Even: " + Integer.toString(difference);
        } else {
            return "Odd: " + Integer.toString(difference);
        }

    }

    public static void main(String[] args) {
        String s1 = "abc bcd cda";
        String s2 = "abc bc";
        System.out.println(returnAStringsDifferenceIsOddOrEven(s1, s2));
    }

}