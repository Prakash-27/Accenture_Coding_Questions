public class sumOfEvenAndProductOfDigitsOdd {

    private static int ProductOfDigits(int n) {
        int productOfDigits = 1;

        while (n != 0) {
            productOfDigits = productOfDigits * (n % 10);
            n = n / 10;
        }

        return productOfDigits;
    }

    private static int SumOfEven(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public static int evenOdd(int N) {
        if(N % 2 == 0) {
            return SumOfEven(N);
        } else {
            return ProductOfDigits(N);
        }
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(12));
        System.out.println(evenOdd(13));
    }
}