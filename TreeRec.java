public class TreeRec {
    static void tree(int num) {
        if (num <= 0) {
            return;
        }
        System.out.println("Pre Call" + num);
        tree(num - 1);
        System.out.println("In B/W Call" + num);
        tree(num - 2);
        System.out.println("Post Call" + num);
    }

    public static void main(String[] args) {
        tree(3);
    }

}
