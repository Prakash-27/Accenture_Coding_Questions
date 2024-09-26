// Given the coordinates of any two vertices of a square(X1, Y1) and (X2, Y2), the task is to find the
// coordinates of the other two vertices. If a square cannot be formed using these two vertices, print -1.

// ex2:
// X1 = 1, X2 = 3
// Y1 = 2, Y2 = 4

//Approach:

// other two vertices are X3,Y3 and X4,Y4

// X3 = X1
// Y3 = Y2
// X4 = X2
// Y4 = Y1


// ex2: 
// X1 = 2, X2 = 2
// Y1 = 4, Y2 = 2

// here X1 = X2

// X3 = X1 + Y2 - Y1
//            |    |
//            ------
//              'a'
// Y3 = Y1
// X4 = X2 + Y2 - Y1
// Y4 = Y2


// ex3: 
// X1 = 2, X2 = 4
// Y1 = 2, Y2 = 2

// here Y1 = Y2

// X3 = X1 
// Y3 = Y1 + X2 - X1
// X4 = X2 
// Y4 = Y2 + X2 - X1


public class findRemainingVerticesOfSquareFromTwoGivenVertices {

    public static void findVertices(int x1, int y1, int x2, int y2) {
        // Check if the x-coordinates are equal
        if(x1 == x2) {
            System.out.println((x1 + (y2 - y1)) + "," + y1);
            System.out.println((x2 + (y2 - y1)) + "," + y2);
        }
         // Check if the y-coordinates are equal
        else if(y1 == y2) {
            System.out.println(x1 + "," + (y1 + (x2 - x1)));
            System.out.println(x2 + "," + (y2 + (x2 - x1)));
        }
        // If the given coordinates forms a diagonal of the square
        else if(Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println(x1 + "," + y2);
            System.out.println(x2 + "," + y1);
        }
        // Otherwise
        else {
            System.out.println("-1");
        }
    }
    
    public static void main(String[] args) {
        // Given two vertices

        //  // If the given coordinates forms a diagonal of the square
        // int x1 = 1, y1 = 2;
        // int x2 = 3, y2 = 4;

        // Check if the x-coordinates are equal
        // int x1 = 2, y1 = 4;
        // int x2 = 2, y2 = 2;

        // Check if the y-coordinates are equal
        int x1 = 2, y1 = 2;
        int x2 = 4, y2 = 2;
        
        findVertices(x1, y1, x2, y2);
    }
}
