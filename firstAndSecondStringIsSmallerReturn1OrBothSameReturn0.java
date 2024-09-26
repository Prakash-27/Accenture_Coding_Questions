// Given 2 string having both uppercase and lowercase characters. Irrespective of the case 
// determine the lexicographically smaller string return -1 if first string is smaller return 1 
// if second string is smaller and 0 if both are equal.

//I/p: String s1 = "SHauRyA"
//I/p: String s2 = "SauraBH"

public class firstAndSecondStringIsSmallerReturn1OrBothSameReturn0 {

    public static int solve(String str1, String str2) {
       String s1 = str1.toLowerCase();
       String s2 = str2.toLowerCase();

       int i = 0, j = 0, value = 0;

       while(i < s1.length() && j < s2.length()) {
           if (s1.charAt(i) > s2.charAt(j)) {
               return value = 1;
           }
           else if(s1.charAt(i) < s2.charAt(j)) {
               return value = -1;
           }
        //    else if(s1.charAt(i) == s2.charAt(j)) {
        //        continue;
        //    }
           i++;
           j++;
       }
       return value; 
    }
    
    public static void main(String[] args) {
        String s1 = "SHauRyA";
        String s2 = "SauraBH";
        System.out.println(solve(s1, s2));
    }
}
