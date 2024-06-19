public class RabinKarp {
    static void rabinKarp(String str, String pat) {
        int strLength = str.length();
        int patternLength = pat.length();
        int patternHash = 0;
        int windowHash = 0;
        // int prime = 101;

        for (int i = 0; i < patternLength; i++) {
            patternHash += pat.charAt(i);
            windowHash += str.charAt(i);
        }

        for (int i = 0; i <= strLength - patternLength; i++) {
            if (patternHash == windowHash) {
                if (str.substring(i, i + patternLength).equals(pat)) {
                    System.out.println("Pattern Found At Index " + i);
                }
            }
 
            if (i < strLength - patternLength ) {
                windowHash = windowHash - str.charAt(i) + str.charAt(i + patternLength);
            }
        }

    }

    public static void main(String[] args) {
        String str = "ABCDE";
        String pat = "CDE";
        rabinKarp(str, pat);
    }

}
