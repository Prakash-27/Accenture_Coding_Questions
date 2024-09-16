// You are given a string array S that contains the names of some files along with their
// versions. Your task is to find and return an integer value representing the latest
// version out of all the files that are correctly named in the array. A file is considered
// correct if it follows the format of the file named as "File_X" (Where X represents the file version number).
// Return -1 if there are no correct files in the array.

// Note: 
//       - A file is incorrect if the name of the file does not match the format.
//       - If there is no file in the files array then also return -1.

// I/p: String[] str = {"File_2", "File 1", "File_6", "Fil_3", "File_10", "File_12s", "File_101d", "File_File", "iuyhefiwhif"};, N = str.length

// O/p: Return an integer value representing the latest version out of all the files that are correctly named in the array.
// O/p: 6

// condition:
// 1. size >= 6 (File_X)
// 2. Substring with first 5 char will be "File_"
// 3. Remaining part will be the version number.

// Approach:
// 1. Iterate throughout the Array.
// 2. check for the size >= 6
// 3. compare the first 5 characters.
// 4. check for the version in Remaining string. (do not directly convert into int)

public class fileVersion {
    
    public static int returnIntegerOfLatestVersionNumberOutOfAllFilesThatAreCorrectlyNamed(String[] str, int n) {
        int maxVersion = -1;

        for (int i = 0; i < n; i++) {
            
            String s = str[i];

            if (s.length() >= 6 && s.substring(0, 5).equals("File_")) {
                
                int idx = 5, ver = 0;
                boolean valid = true;

                while (idx < s.length()) {
                    
                    if (s.charAt(idx) >= 48 && s.charAt(idx) <= 57) {
                        ver = ver * 10 + (s.charAt(idx) - 48);
                    } 
                    else {
                        valid = !valid;
                        break;
                    }
                    idx++;
                }

                if(valid) {
                    // if (ver > maxVersion) {
                    //     maxVersion = ver;
                    // }
                    maxVersion = Math.max(maxVersion, ver);
                }
            }

        }
        return maxVersion;
    }

    public static void main(String[] args) {
        String[] str = {"File_2", "File 1", "File_6", "Fil_3", "File_10", "File_12s", "File_101d", "File_File", "iuyhefiwhif"};
        System.out.println(returnIntegerOfLatestVersionNumberOutOfAllFilesThatAreCorrectlyNamed(str, str.length));
    }

}
