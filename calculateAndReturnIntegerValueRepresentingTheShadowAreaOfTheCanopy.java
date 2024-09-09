// You are developing a feature for an environmental awareness app that helps users to 
// know how much area their tree's shadow covers. You have the distance D from a
// tree's trunk to the edge of the shadow. Your task is to calculate and return an integer
// value representing the shadow area of the canopy.

// Note: Round off the result to nearest integer.

// I/p: An integer value D, representing the distance from the tree trunks to the
//      edge of shadow.

// O/p: Return an integer value representing the shadow area of the canopy.

// I/p: 5

// O/p: 78

// Explanation: Here, D = 5 So, area of the canopy would be 3.14 * 5 * 5 = 78.5, Therefore, 78 will be return.

public class calculateAndReturnIntegerValueRepresentingTheShadowAreaOfTheCanopy {
    
    public static int shadowAreaOfTheCanopy(int D) {
        float Area = (float) (3.14 * D * D);
        return (int) Math.floor(Area);
    }

    public static int shadowAreaOfTheCanopy1(int D) {
        float Area = (float) (3.14 * D * D);
        int area = (int) (3.14 * D * D);

        if(Area - area <= 0.5) {
            return area;
        } else {
            return area + 1;
        }
    }

    public static void main(String[] args) {
        int D = 5;
        System.out.println(shadowAreaOfTheCanopy(D));
        System.out.println(shadowAreaOfTheCanopy1(D));
    }

}
