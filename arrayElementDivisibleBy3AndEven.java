// Return Avg of Array elements divisible by 3 & even
//                          (or)
// Return Avg of Array elements divisible by 3 & 2

// I/p: int[] num = {12,24,3,5,6,7,8,9,18};

// O/p: 15

public class arrayElementDivisibleBy3AndEven {
    
    public static int divisibleBy3AndEven(int[] nums) {
        int sum = 0;
        int N = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 6 == 0) {
                sum+= nums[i];
                N++;
            }
        }

        int Avg = sum/N;

        return Avg;
    }

    public static void main(String[] args) {
        int[] num = {12,24,3,5,6,7,8,9,18};
        System.out.println(divisibleBy3AndEven(num)); // 15
    }
}
