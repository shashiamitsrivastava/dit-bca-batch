public class One {
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 2) + fibonacci(n - 3);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));

    }

}
