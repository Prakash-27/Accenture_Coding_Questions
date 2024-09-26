// You are given two input String: input1 and input3, along with an Ineger input2 that represents
// the size of input1. Write a program that performs the following tasks:
// Write a function countOccurrences that counts how many times the String input3 appears in the 
// String input1.

//ex:
//I/p: String input1 = "axttajkltsr";
//I/p: int input2 = input1.length();
//I/p: String input3 = "t";

//O/p: 3

public class howManyTimesString3AppearsInString1 {

    public static int countOccurrences(String input1, int input2, String input3) {
        // Ensure input1 length is not equal to input2 return -1.
        if(input1.length() != input2) {
            System.out.println("Error: input1 length does not match input2");
            return -1;
        }

        int count = 0;
        int n1 = input1.length();
        int n3 = input3.length();

        // loop through input1 to find occurrences of input3
        for(int i = 0; i <= n1-n3 ; i++) {
            int j;
            // check if input3 matches with substring of input1 starting at i.
            for(j = 0; j < n3; j++) {
                if(input1.charAt(i+j) != input3.charAt(j)) {
                    break;
                }
            }
            // If the entire input3 is found, increment the count
            if(j == n3) {
                count++;
            }
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        String input1 = "axttajkltsr";
        int input2 = input1.length();
        String input3 = "t";

        String input11 = "hellomyhelhelloishello";
        int input12 = input11.length();
        String input13 = "hello";

        int result = countOccurrences(input1, input2, input3);
        int result1 = countOccurrences(input11, input12, input13);

        if(result != -1) {
            System.out.println("The String " + input3 + " appears " + result + " times in " + input1 + ".");
        }
        if(result1 != -1) {
            System.out.println("The String " + input13 + " appears " + result1 + " times in " + input11 + ".");
        }

        
    }
}
