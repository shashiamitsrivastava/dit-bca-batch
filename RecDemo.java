public class RecDemo {
    static void printName(int val) {
        if (val == 0) {
            return;
        }
        System.out.println("Yash " + val);
        printName(val - 1);
        System.out.println("Yash " + val);
    }

    public static void main(String[] args) {
        printName(5);
    }
}