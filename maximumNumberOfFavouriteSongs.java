// Alice has collection of songs represented as a string S where each character represents a 
// song. A playlist is the substring of the given string with exactly k number of songs. She wants
// to create a playlist that contains maximum number of her favourite song which is 'a'. Your task
// is to find and return an integer value representing the maximum number of favourite songs 
// that she can get in a single playlist.

// Input: s = "acdbaaca", k = 3
// substring of s of size 3 {"acd", "cdb", dba, baa, aac, aca}

// output: favourite song is 'a' so 'a' is appeared in 2 times in substring of s of size 3 

public class maximumNumberOfFavouriteSongs {
    
    public static int maximumNumberOfFavorSongs(String str, int n, int k) {
        int count = 0, max = 0;
        int i = 0;
        int j = -1;

        while (j < k-1) { // calculating for first window of k size
            if (str.charAt(++j) == 'a') count++;
        }

        max = count;

        while (j < n-1) {
            if(str.charAt(i++) == 'a') count--;
            if(str.charAt(++j) == 'a') count++;

            if(count > max) max = count;
        }

        return max;
    }

    public static void main(String[] args) {
        String str = "acdbaaca";
        String str1 = "aabaaa";
        System.out.println(maximumNumberOfFavorSongs(str, str.length(), 3));
        System.out.println(maximumNumberOfFavorSongs(str1, str1.length(), 3));
    }

}
