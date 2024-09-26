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


    public static void pattern1(int N) {
        int count = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(" ");
            System.out.print(count++);
            }
            System.out.println();
        }
    }

    public static void pattern2(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(" ");
            System.out.print(count + j);
            }
            System.out.println();
        }
    }

    public static void pattern3(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(" ");
            System.out.print(count + i);
            }
            System.out.println();
        }
    }

    public static void pattern4(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(count + i);
            }
            System.out.println();
            count++;
        }
    }

    public static void pattern5(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(count);
            }
            System.out.println();
            // count++;
        }
    }

    public static void pattern6(int N) {
        int count = 0;
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N; j++) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(count);
            }
            System.out.println();
            // count++;
        }
    }

    public static void pattern7(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = N; j >= i; j--) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N; j++) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1+i; j <= N; j++) {
               System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
        pattern1(5);
        pattern2(4);
        pattern3(4);
        pattern4(4);

        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
    }
}
