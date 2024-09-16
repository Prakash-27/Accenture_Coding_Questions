// You are stuck on an island where they sell eat coconut sweets only. A person can buy at
// most 1 box per day with each box containing N pieces. To remain alive, you must consume E
// coconut sweets daily for D days, but the catch is that you cannot purchase sweets on Sundays.

// Your task is to find and return an integer value representing the minimum number of times 
// you have to buy coconut sweets in order to stay alive. If not possible. return -1.

// Note: The day starts from Monday

// Input: 
//        - An integer value N, representing the number of coconut sweets per box.
//        - An integer value E, representing the number of coconut sweets you must eat daily.
//        - An integer value D, representing the number of days.

// I/p: N = 5, E = 2, D = 10

// O/p: 4

public class eatCoconutSweets {

    public static int countMinimumNumberOfTimesYouHaveToBuyCoconutSweetsDaily(int numberOfCoconutSweetsPerBox, int numberOfCoconutSweetsYouMustEatDaily, int numberOfDays) {
        if(numberOfCoconutSweetsPerBox == 0) return -1;
        if (numberOfCoconutSweetsYouMustEatDaily == 0 || numberOfDays == 0) return 0;
        if(numberOfDays < 7) return ((numberOfDays*numberOfCoconutSweetsYouMustEatDaily) % numberOfCoconutSweetsPerBox == 0) ? numberOfDays*numberOfCoconutSweetsYouMustEatDaily/numberOfCoconutSweetsPerBox : numberOfDays*numberOfCoconutSweetsYouMustEatDaily/numberOfCoconutSweetsPerBox + 1;
        if(numberOfCoconutSweetsPerBox*6 < numberOfCoconutSweetsYouMustEatDaily*7) return -1;

        int ans = 0;

        // complete weeks

        int week = numberOfDays / 7;

        ans += ((7*week*numberOfCoconutSweetsYouMustEatDaily) % numberOfCoconutSweetsPerBox == 0) ? ((7*week*numberOfCoconutSweetsYouMustEatDaily)/numberOfCoconutSweetsPerBox) : ((7*week*numberOfCoconutSweetsYouMustEatDaily)/numberOfCoconutSweetsPerBox) + 1;

        int left = ans*numberOfCoconutSweetsPerBox - 7*week*numberOfCoconutSweetsYouMustEatDaily;

        // remaining days

        int days = numberOfDays % 7;

        int req = (days*numberOfCoconutSweetsYouMustEatDaily - left);

        ans += (req % numberOfCoconutSweetsPerBox == 0) ? (req / numberOfCoconutSweetsPerBox) : (req / numberOfCoconutSweetsPerBox) + 1;

        return ans;
    }

    public static void main(String[] args) {
        int numberOfCoconutSweetsPerBox = 5;
        int numberOfCoconutSweetsYouMustEatDaily = 2;
        int numberOfDays = 10;

        System.out.println(countMinimumNumberOfTimesYouHaveToBuyCoconutSweetsDaily(numberOfCoconutSweetsPerBox, numberOfCoconutSweetsYouMustEatDaily, numberOfDays));
    }

}