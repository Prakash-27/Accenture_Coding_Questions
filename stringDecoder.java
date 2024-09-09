// You are provided with a String Which has sequence of 1s and 0s. This sequence is the 
// encoded version of a english word. You are supposed to write a program to decode the
// provided string and find the original word. Each uppercase Alphabet is representing by a 
// sequence of 1s.

// Also two alphabets are separated by a '0'

// A -> 1
// B -> 11
// C -> 111
// Z -> 111111.....26times


// Input:  "1 0 1 1 1 0 1 1"
// Output:  A     C      B

public class stringDecoder {
    
    public static String findTheOriginalAlphabetOfSequence(String str, int n) {
        int count = 0;
        String Answer = "";
        int value =  0;

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '1') {
                count++;
            } else {
                value = 'A' + count - 1;
                Answer += (char)value;
                count = 0;
            }
        }

        value = 'A' + count - 1;
        Answer += (char)value;

        return Answer;
    }

    public static void main(String[] args) {
        String str = "10111011";
        System.out.println(findTheOriginalAlphabetOfSequence(str, str.length())); // ACB
    }

}
