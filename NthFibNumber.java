public class NthFibNumber {
    static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int firstTerm = fib(num - 1);
        int secTerm = fib(num - 2);
        return firstTerm + secTerm;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(fib(num));
    }

}
