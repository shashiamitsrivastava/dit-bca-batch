public class SumOfDigit {
    static void sumofDigit(int number, int sum) {
        if (number == 0) {
            System.out.println("The sum is " + sum);
            return;
        }

        sum += number % 10;

        sumofDigit(number / 10, sum);

    }

    static int sumofDigit(int number) {
        if (number == 0) {
            return 0;
        }
        int sum = sumofDigit(number / 10);
        sum += number % 10;
        return sum;

    }

    public static void main(String[] args) {
        int number = 12345;
        // sumofDigit(number, 0);
        System.out.println(sumofDigit(number));
    }
}