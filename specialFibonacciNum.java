public class specialFibonacciNum {

    public static int specialFib(int n) {
        if(n == 0 || n == 1) return 1;

        int pre1 = 1, pre2 = 1;

        for (int i = 2; i < n; i++) {
            int curr = (pre1 * pre1 + pre2 * pre2) % 47;
            pre1 = pre2;
            pre2 = curr;
        }

        return pre2%47;
    }
    
    public static void main(String[] args) {
        System.out.println(specialFib(5));
    }
}
