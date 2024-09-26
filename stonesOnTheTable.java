// There are n stones on the table in a row, each of them can be red, green or blue. 
// Count the minimum number of stones to take from the table so that any two neighboring stones 
// had different colors. Stones in a row are considered neighboring if there are no other stones between them.


//Input:
// The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

// The next line contains string s, which represents the colors of the stones. We'll consider the 
// stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", 
// if the i-th stone is red, "G", if it's green and "B", if it's blue.


// Output:
// Print a single integer — the answer to the problem.

//I/p:
// 3
// RRG

//O/p:
// 1

//I/p:
// 5
// RRRRR

//O/p:
// 4

//I/p:
// 4
// BRBG

//O/p:
// 0


public class stonesOnTheTable {

    public static int StoneOnTable(String str, int n) {
        int c = 0;

        for(int i = 0; i < n-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        String str = "RRG";
        String str1 = "RRRRR";
        String str2 = "BRBG";

        System.out.println(StoneOnTable(str, str.length()));
        System.out.println(StoneOnTable(str1, str1.length()));
        System.out.println(StoneOnTable(str2, str2.length()));
    }
}
