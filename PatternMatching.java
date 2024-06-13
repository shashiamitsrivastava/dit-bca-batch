public class PatternMatching {
    public static void main(String[] args) {
        String str = "My Name is Yash";
        String pattern = "Yash";
        int s = str.length();
        int p = pattern.length();

        for (int i = 0; i <= s - p; i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (pattern.charAt(j) != str.charAt(i + j)) {
                    break;
                }
            }
            if (j == p) {
                System.out.println("Pattern Found At index " + i);
            }
        }

    }

}
