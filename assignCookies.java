// Greedy Algorithm Problem
// Assume you are an awesome parent and want to give your children some cookies. But you should 
// give each child at most one cookie.

// Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be 
// content with; and each cookie j has a size s[j]. If S[j] >= g[i], we can assign the cookie j to the 
// child i, and the child i will be content. Your goal is to maximize the number of your content children
// and output the maximum number.

// I/p: int[] g = {1,2,3};
//      int[] s = {1,1};
// O/p: 1

// I/p: int[] g = {1,2};
//      int[] s = {1,2,3};
// O/p: 2

// Approach:
// - sort Both greed and size array.
// - i(child) = 0, j(cookie) = 0, count = 0;
// - while(i < s.length && j < g.length)
//     - if(s[i] >= g[j]) i++; j++; count++;
//     - else i++;
// - return count;

import java.util.Arrays;

public class assignCookies {

    public static int maxNumber(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0, count = 0;

        while(i < s.length && j < g.length) {
            if(s[i] >= g[j]) {
                i++;
                j++;
                count++;
            }
            else {
                i++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        int[] g1 = {1,2};
        int[] s1 = {1,2,3};
        System.out.println(maxNumber(g, s));
        System.out.println(maxNumber(g1, s1));
    }
}
