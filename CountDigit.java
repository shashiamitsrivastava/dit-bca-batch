public class CountDigit {
    static int countDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigit(number / 10);

    }

    public static void main(String[] args) {
        System.out.println(countDigit(12345));
    }

}
