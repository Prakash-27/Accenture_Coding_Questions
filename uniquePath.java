// Q1.
// Unique Path states that given the m*n grid where a robot starts from the top left corner of the
// grid. we need to find the total number of ways to reach the bottom right corner of the grid
// The robot can only move either down or right at any point in time.

// There are some cells containing Obstacles which are represented by 1 while 0 for a free cell.

//      0   1   2  
//    -------------
// 0  | 0 | 0 | 0 | 
//    -------------
// 1  | 0 | 1 | 0 | 
//    -------------
// 2  | 0 | 0 | 0 | 
//    -------------

// Q2.
// The problem is to count all unique possible paths from the top left to the bottom right of a M X N matrix 
// with the constraints that from each cell you can either move only to the right or down.

// Input:  M = 2, N = 2
// Output: 2
// Explanation: There are two paths
// (0, 0) -> (0, 1) -> (1, 1)
// (0, 0) -> (1, 0) -> (1, 1)

// Input:  M = 2, N = 3
// Output: 3
// Explanation: There are three paths
// (0, 0) -> (0, 1) -> (0, 2) -> (1, 2)
// (0, 0) -> (0, 1) -> (1, 1) -> (1, 2)
// (0, 0) -> (1, 0) -> (1, 1) -> (1, 2)

import java.util.Arrays;

public class uniquePath {

    // iterative DP
    public static int uniquePathOfGrid(int[][] obstacleGrid) {
        int n = obstacleGrid.length; // row length
        int m = obstacleGrid[0].length; // column length

        if(n == 0) return 0;
        if(m == 0) return 0;

        if(obstacleGrid[n-1][m-1] == 1) return 0;

        int[][] dp = new int[n+1][m+1];

        for (int i = n-1; i >= 0; i--) {
            for (int j = m-1; j >= 0; j--) {
                if (obstacleGrid[i][j] != 1) {
                    if(i+1<n && j+1<m) { // no out of bound
                        dp[i][j] = dp[i+1][j] + dp[i][j+1];
                    }
                    else if(i+1<n && j+1==m) { // column out of bound
                        dp[i][j] = dp[i+1][j];
                    }
                    else if(i+1==n && j+1<m) { // row out of bound
                        dp[i][j] = dp[i][j+1];
                    }
                    else { // both row and column are out of bound
                        dp[i][j] = 1;
                    }
                }
            }
        }
        return dp[0][0];
    }

    // alter one recursive 
    static int UniquePathHelper(int i, int j, int r, int c, int[][] A) {
    // boundary condition or constraints
    if (i == r || j == c) {
      return 0;
    }

    if (A[i][j] == 1) {
      return 0;
    }

    // base case
    if (i == r - 1 && j == c - 1) {
      return 1;
    }

    return UniquePathHelper(i + 1, j, r, c, A) + UniquePathHelper(i, j + 1, r, c, A);
  }

  static int uniquePathsWithObstacles(int[][] A)
  {

    int r = A.length, c = A[0].length;

    return UniquePathHelper(0, 0, r, c, A);
  }

  // Alter one dp
  public static int UniquePathHelper1(int i, int j, int r,
                                       int c, int[][] A,
                                       int[][] paths)
    {
        // boundary condition or constraints
        if (i == r || j == c) {
            return 0;
        }
        else if (A[i][j] == 1) {
            return 0;
        }
        // base case
        else if (i == r - 1 && j == c - 1) {
            return 1;
        }
        else if (paths[i][j] != -1) {

            return paths[i][j];
        }
        else {
            return paths[i][j]
                = UniquePathHelper1(i + 1, j, r, c, A, paths)
                  + UniquePathHelper1(i, j + 1, r, c, A,
                                     paths);
        }
    }

    public static int uniquePathsWithObstacles1(int[][] A)
    {
        int r = A.length;
        int c = A[0].length;
        // create a 2D-matrix and initializing
        // with value 0
        int[][] paths = new int[r][c];

        for (int i = 0; i < r; i++) {
            Arrays.fill(paths[i], -1);
        }

        return UniquePathHelper1(0, 0, r, c, A, paths);
    }


//--------------------------------------------------------------------------------------------------

    // Q2.
    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    static int numberOfPaths(int m, int n)
    {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1)
            return 1;

        // If diagonal movements are allowed then
        // the last addition is required.
        return numberOfPaths(m - 1, n)
            + numberOfPaths(m, n - 1);
        // + numberOfPaths(m-1, n-1);
    }

    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    static int numberOfPaths1(int m, int n, int[][] dp)
    {
        // If either given row number is first or
        // given column number is first
        if (m == 1 || n == 1) return 1;

        if (dp[m][n] != -1) return dp[m][n];


        // If diagonal movements are allowed then
        // the last addition is required.
        return dp[m][n] = numberOfPaths1(m - 1, n, dp) + numberOfPaths1(m, n - 1, dp);
        // + numberOfPaths(m-1, n-1);
    }

    static int uniquepath(int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return numberOfPaths1(m, n, dp);
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = { {0,0,0},
                                 {0,1,0},
                                 {0,0,0} };
        int[][] obstacleGrid1 = { {0,0},
                                  {1,1},
                                  {0,0} };
        System.out.println(uniquePathOfGrid(obstacleGrid));                          
        System.out.println(uniquePathOfGrid(obstacleGrid1));   
        
        // System.out.println(numberOfPaths(2, 2));
        // System.out.println(numberOfPaths(2, 3));
        // System.out.println(numberOfPaths(3, 3));
        // System.out.println(uniquepath(2, 2));
        // System.out.println(uniquepath(2, 3));
        // System.out.println(uniquepath(3, 3));
    }
}