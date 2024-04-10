public class PrintTable {
    static void printTable(int num, int mul) {
        if (mul < 1) {
            return;
        }
        printTable(num, mul - 1);
        System.out.println(num + "*" + mul + "=" + num * mul);
    }

    static String table(int num, int mul) {
        if (mul < 1) {
            return "";
        }
        String table = table(num, mul - 1);
        table += num + "*" + mul + "=" + num * mul + "\n";
        return table;
    }

    public static void main(String[] args) {
        int num = 5;
        // printTable(num, 10);
        System.out.println(table(num, 10));
    }

}
