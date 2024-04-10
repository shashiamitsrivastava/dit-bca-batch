public class Palindrome {
    static void checkPalindrome(int number, int cpy, int reverse) {
        if (number == 0) {
            if (reverse == cpy) {
                System.out.println("The number is Palindrome");
            } else {
                System.out.println("The number is Not Palindrome");
            }
            return;

        }
        reverse = reverse * 10 + number % 10;
        checkPalindrome(number / 10, cpy, reverse);
    }

    public static void main(String[] args) {
        checkPalindrome(1234, 1234, 0);
    }

}
