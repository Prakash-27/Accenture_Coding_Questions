// Given a string in Input which is nothing but the 
// words separated by full stop(.) And we have to return largest size of word.

// ex: 
// I/p: String str = "hello.my.name.is.shaurya";
// O/p: "shaurya"

public class wordSeparatedByFullStop {
    
    public static int largestSizeOfWord(String str, int n) {
        int length = 0;
        int maxlength = 0;
        int i = 0;
        int j = 0;

        char[] s = str.toCharArray();

        while (i < n && j < n) {
            if (s[i] == s[j] && s[i] != '.' && s[j] != '.') {
                length++;
                i++;
                j++;
            } else {
                i++;
                j++;
                length = 0;
            }

            if (length > maxlength) {
                maxlength = length;
            }
        }
        return maxlength;
    }

    // public static int largestSizesOfWord(String str, int n) {
    //     int length = 0;
    //     int maxlength = 0;
    //     int i = 0;
    //     int j = i+1;

    //     char[] s = str.toCharArray();

    //     while (i < n && j < n) {
    //         if (s[i] != s[j] && s[j] != '.') {
    //             length++;
    //             i++;
    //             j++;
    //         } else if(s[i] == s[j]) {
    //             i++;
    //             j++;
    //         }
    //          else {
    //             i+=2;
    //             j++;
    //             length = length + 1;
    //         }

    //         if (length > maxlength) {
    //             maxlength = length;
    //         }

    //         length = 0;
    //     }
    //     return maxlength;
    // }

    public static void main(String[] args) {
        String str = "hello.my.name.is.shaurya";
        String str1 = "hello.shan.cpp";
        System.out.println(largestSizeOfWord(str, str.length()));
        System.out.println(largestSizeOfWord(str1, str1.length()));        
    }

}
