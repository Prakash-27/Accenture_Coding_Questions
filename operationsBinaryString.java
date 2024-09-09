// The Binary number system only uses two digits. 0 and 1 and number system can be called binary string. 
// You are required to implement the following function: int OperationsBinaryString(String str);

// The function accepts a string str as its argument. the string str consists of binary digits separated with an alphabet as follows:
// -A denotes AND operation
// -B denotes OR operation
// -C denotes XOR operation

// You are required to calculate the result of the string str, scanning the string to right taking one operation at a time, and return the same.

// Note:
//      - No order of priorities of operations is required 
//      - Length of str is odd
//      - If str is NULL or None (in case of Python), return -1.

// Input : str = 1C0C1C1A0B1

public class operationsBinaryString {
    

    public static int operationBinaryString(String str) {
        int n = str.length();

        if (n == 0) {
            return -1;
        }
                                                // str.charAt(0) is in char we want to convert it to integer
        int answer = str.charAt(0) - '0'; // '1' - '0' => 49 - 48 => 1 (it return integer value as answer)

        for (int i = 1; i < n - 1; i = i + 2) {
            int op = str.charAt(i);         // str.charAt(i+1) is in char we want to convert it to integer
            int b = str.charAt(i+1) - '0'; // '0' - '0' => 48 - 48 => 0 (it return integer value as b)

            if (op == 'A') {
                answer = answer & b;
            } else if(op == 'B') {
                answer = answer | b;
            } else if(op == 'C') {
                answer = answer ^ b;
            } else {
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        System.out.println(operationBinaryString(str));
    }

}
