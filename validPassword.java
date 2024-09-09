// you are given a function checkPassword(char str[], int n)
// return 1 -> valid Password
// return 0 -> Invalid Password

// String is a if valid password if it satisfies the following conditions
// -> At least 4 char
// -> At least 1 Numeric 
// -> At least one capital letter
// -> No space or slash (/)
// -> starting char must not be a number.

/**
 * validPassword
 */
public class validPassword {

    public int checkPassword(String str, int n) {

        // -> At least 4 char
        if(n < 4) {
            return 0;
        }

        // -> starting char must not be a number.
        if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return 0;
        }

        int capitalLetterCount = 0, numericNumberCount = 0;

        for(int i = 0; i < n; i++) {
            // -> No space (32) or slash (/) (47)
            if(str.charAt(i) == ' ' || str.charAt(i) == '/' ) {
                return 0;
            }

            // -> At least one capital letter
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                capitalLetterCount++;
            }
            // -> At least 1 Numeric 
             else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numericNumberCount++;
            }

        }

        // return 1 if there are > 0 numericNumberCount and capitalLetterCount
        if (capitalLetterCount > 0 && numericNumberCount > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = "A164";
        int n = str.length();

        validPassword vp = new validPassword();

        System.out.println(vp.checkPassword(str, n));
        
    }
}