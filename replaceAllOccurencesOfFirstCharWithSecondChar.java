// 1. Given string and two characters ch1,ch2 as input, replace all occurences of ch1 with ch2 and ch2 with ch1 in the input string.

// I/p: "shaurya" , 's', 'a'
// O/p: "ahsurys"

// 2. Given a string str and two characters X and Y, the task is to write a recursive function to replace all occurrences of character X with character Y.

// Input: str = abacd, X = a, Y = x 
// Output: xbxcd

// Input: str = efegh, X = e, Y = y 
// Output: yfygh

public class replaceAllOccurencesOfFirstCharWithSecondChar {
    
    // 1.
    public static String replaceAllOccurenceChar(String str, char ch1, char ch2) {
        char arr[] =  str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == ch1) {
                arr[i] = ch2;
            } 
            else if(arr[i] == ch2) {
                arr[i] = ch1;
            }
        }

        return String.valueOf(arr);
    }

    // 2.
    public static String replaceCharacter(String str, char c1, char c2) {
        char arr[] = str.toCharArray();
        int j = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (arr[i] != c1) {
                arr[j++] = arr[i];
            } else {
                arr[j++] = c2;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(replaceAllOccurenceChar("shaurya", 's', 'a')); // ahsurys
        System.out.println(replaceCharacter("abacd", 'a', 'x')); // xbxcd
        System.out.println(replaceCharacter("efegh", 'e', 'y')); // yfygh
    }
}
