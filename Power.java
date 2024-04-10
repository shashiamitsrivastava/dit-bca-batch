public class Power {
    static int power(int number, int pow) {
        if (pow == 0) {
            return 1;
        }
        int ans = power(number, pow - 1);
        ans *= number;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));

    }
}
