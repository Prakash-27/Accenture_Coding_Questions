// Leetcode Question (famous)
// Given two binary String a and b return their sum as a binary string.

// Ex:
// String a = "1010"
// String b = "1011"

// O/p: "10101"

public class addBinary {

    public static String AddBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;
        String answer = "";
        
        while(i >= 0 || j >= 0 || carry != 0) {
            if(i>=0) {
                carry = carry + a.charAt(i) - '0';
                i--;
            }
            if(j>=0) {
                carry = carry + b.charAt(j) - '0';
                j--;
            }

            answer = answer + (carry % 2);
            carry = carry/2;
        }
        answer =  reverse(answer);
        return answer;
    }
    
    
    public static String reverse(String answer) {
        char[] ch = answer.toCharArray();
        int len = ch.length;
        String rev = "";
        for (int i = len-1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        return rev;
    }


    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(AddBinary(a, b));
    }
}
