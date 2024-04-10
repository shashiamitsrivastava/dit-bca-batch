public class PrintStartRec {

    static void printStar(int numberOfStar) {
        if (numberOfStar == 0) {
            return;
        }
        System.out.print("*");
        printStar(numberOfStar - 1);
    }

    static void printLine(int numberOfLines) {
        if (numberOfLines == 0) {
            return;
        }
        printStar(numberOfLines);
        System.out.println();
        printLine(numberOfLines - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        printLine(n);
    }

}
