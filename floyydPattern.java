// To Print Floyyd Pattern for no. N as Input
// I/p: N = 4


public class floyydPattern {
    
    public static void pattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
