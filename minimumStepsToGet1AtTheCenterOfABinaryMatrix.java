// Given an 5 * 5 matrix where N is odd with all 0 values except for a single cell which has the value 1.
// The task is to find the minimum possible moves to get this 1 to the center of the matrix when in a 
// single move, any two consecutive rows or two consecutive columns can be swapped.

// Example:

//      0   1   2   3   4
//    --------------------
// 0  | 0 | 0 | 0 | 0 | 0 |
//    --------------------
// 1  | 0 | 0 | 0 | 0 | 1 |
//    --------------------
// 2  | 0 | 0 | 0 | 0 | 0 | -> In (2,2) we have to place 1 
//    --------------------
// 3  | 0 | 0 | 0 | 0 | 0 |
//    --------------------
// 4  | 0 | 0 | 0 | 0 | 0 |
//

// O/p: 3

// Approach 
// - find center of the matrix
// - find the coordinates of cell having 1 values
// - find distance from centre separately of both axis.
//            - Diffx = abs(Cx - X) // Cx = 2
//            - Diffx = abs(Cy - Y) // Cy = 2
// - Return Diffx + Diffy

public class minimumStepsToGet1AtTheCenterOfABinaryMatrix {

    public static int minMovies(int[][] mat, int N) {
        // Center of the matrix
        int Centerx = N/2, Centery = N/2;

        // Find the coordinates or position of the value 1
        int CoordinateOf1_x = 0, CoordinateOf1_y = 0;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if(mat[x][y] == 1) {
                    CoordinateOf1_x = x;
                    CoordinateOf1_y = y;
                    break;
                }
            }
        }

        int Diffx = (int) Math.abs(Centerx - CoordinateOf1_x); 
        int Diffy = (int) Math.abs(Centery - CoordinateOf1_y);

        return Diffx + Diffy;
    }

    public static void main(String[] args) {
        int[][] mat = { {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,1,0,0} }; 

        int[][] mat1 = {{0,0,0,0,0},
                        {0,0,0,0,1},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}};  
        
        System.out.println(minMovies(mat, mat.length)); // 2               
        System.out.println(minMovies(mat1, mat1.length)); // 3               
    }
    
}
