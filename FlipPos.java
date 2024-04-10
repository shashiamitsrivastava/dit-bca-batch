public class FlipPos {
    public static void main(String[] args) {
        int number = 32145;
        int pos = 1;
        int sum = 0;

        while (number != 0) {
            int mod = number % 10;
            sum += pos * (int) Math.pow(10, mod - 1);
            pos++;
            number /= 10;

        }
        System.out.println(sum);
    }

}
