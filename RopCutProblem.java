public class RopCutProblem {
    static int maximumCuts(int len, int a, int b, int c) {
        if (len == 0) {
            return 0;
        }
        if (len < 0) {
            return -1;
        }
        int option1 = maximumCuts(len - a, a, b, c);
        int option2 = maximumCuts(len - b, a, b, c);
        int option3 = maximumCuts(len - c, a, b, c);
        int result = Math.max(Math.max(option1, option2), option3);
        if (result == -1) {
            return -1;
        }
        return result + 1;

    }

    public static void main(String[] args) {
        int len = 5;
        int a = 8;
        int b = 6;
        int c = 7;
        System.out.println(maximumCuts(len, a, b, c));

    }

}
