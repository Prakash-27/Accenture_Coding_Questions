public class power {

    public static int Power(int x, int n) { // TC -> O(log2 n)  SC -> O(1)
        // if n is negative we are making it 1/n
        int m = n;
        int ans = 1;

        while(n > 0) {
            // if n is odd we are seperating one power from original n and add it into ans.
            // (which will make odd n to even n)
            // And we are reducing one value from n (x^n => 2^3 => 2^1(odd) 2^2(even))
            if(n % 2 == 1) {
                ans = ans * x; 
                n = n - 1;
            }
            else if(n % 2 == 0) {
                n = n/2;
                x = x*x;
            }

            if(m < 0) {
                ans = 1/ans; // 5^-2 is 1/5^2 which is 1/25
            }
        }
        return ans;
    } 

    public static double PowerDouble(double x, int n) { // TC -> O(log2 n)  SC -> O(1)
        // if n is negative we are making it 1/n
        int m = n;
        double ans = 1;

        while(n > 0) {
            // if n is odd we are seperating one power from original n and add it into ans.
            // (which will make odd n to even n)
            // And we are reducing one value from n (x^n => 2^3 => 2^1(odd) 2^2(even))
            if(n % 2 == 1) {
                ans = ans * x; 
                n = n - 1;
            }
            else if(n % 2 == 0) {
                n = n/2;
                x = x*x;
            }

            if(m < 0) {
                ans = 1/ans; // 5^-2 is 1/5^2 which is 1/25
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(Power(2, 2));
        System.out.println(Power(3, -10));
        System.out.println(PowerDouble(5.5, 2));
    }
}
