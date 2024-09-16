// input an NxN matrix mat() and find the minimum value of k such that all the 
// elements in the rows and columns of the kth index are 0 irrespective of the element at (k,k)

//      0   1   2   3   4
//    --------------------
// 0  | 1 | 0 | 6 | 0 | 9 |
//    --------------------
// 1  | 0 | 2 | 0 | 0 | 0 |
//    --------------------
// 2  | 4 | 0 | 1 | 0 | 2 |
//    --------------------
// 3  | 0 | 0 | 0 | 0 | 0 |
//    --------------------
// 4  | 8 | 0 | 7 | 0 | 4 |
//    --------------------

// Approach:
// - Run a loop from k = 0 -> k = N-1
// - for each value of k check:
//                              - Whether kth row contains all zero irrespective of Mat[k][k];
//                              - Whether kth column contains all zero irrespective of Mat[k][k];
// - If both row and column check pass return k;
// - else return -1;

public class matrixProblem {
    
    public static int findTheMinimumValueOfKSuchThatAllTheElementsInRowAndColumnsOfKthIndexAreZero(int[][] matrix, int n) {
        // Iterate through each index to check for the condition
        for (int k = 0; k < n; ++k) {
            boolean rowCheck = true, columnCheck = true;

            // Check the k-th row excluding (k,k)
            for (int j = 0; j < n; ++j) {
                if (j != k && matrix[k][j] != 0) {
                    rowCheck = false;
                    break;
                }
            }

            // Check the k-th column excluding (k,k)
            for (int i = 0; i < n; ++i) {
                if (i != k && matrix[i][k] != 0) {
                    columnCheck = false;
                    break;
                }
            }

            // If both row and column check pass. return the current k
            if (rowCheck && columnCheck) {
                return k; // Return the first k that satisfies the condition
            }
        }
        return -1; // If no such k exists, return -1
    }

    public static void main(String[] args) {
        int[][] matrix = { {1,0,6,0,9},
                           {0,2,0,0,0},
                           {4,0,1,0,2},
                           {0,0,0,0,0},
                           {8,0,7,0,4} }; 

        System.out.println(findTheMinimumValueOfKSuchThatAllTheElementsInRowAndColumnsOfKthIndexAreZero(matrix, matrix.length));     

        // int[][] matrix1 = { {1,0,6,0},
        //                     {0,2,0,0},
        //                     {4,0,1,0},
        //                     {0,0,0,0},
        //                     {8,0,7,0} }; 
        
        // System.out.println(matrix.length); // 5x5 => return row length 5 (here row and column are same length)                  
        // System.out.println(matrix1.length); // 5x4 => return row length 5                   
        // System.out.println(matrix1[1].length); // 5x4 => return column length 4 (matrix1[1].length means first column length)                   
    }
}
