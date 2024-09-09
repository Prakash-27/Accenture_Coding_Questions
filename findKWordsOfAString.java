// Find first k words of a string.
// Input: "MY NAME IS PRAKASH S", K = 3
// Output: "MY NAME IS".

public class findKWordsOfAString {
    
    public static String kWordsOfString(String string, int k) {
       int count = 0;

       for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    return string.substring(0, i);
                }

            }
       }
       return "";
    }

    public static void main(String[] args) {
        System.out.println(kWordsOfString("MY NAME IS PRAKASH S", 3));
        System.out.println(kWordsOfString("MY NAME IS PRAKASH S", 4));
    }

}
