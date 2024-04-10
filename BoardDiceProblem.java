public class BoardDiceProblem {
    static void boardDice(int currentValue, int maximumValue, String result) {
        if (currentValue == maximumValue) {
            System.out.print(result + " , ");
            return;
        }

        if (currentValue > maximumValue) {
            return;
        }
        for (int dice = 1; dice <= 6; dice++) {
            boardDice(currentValue + dice, maximumValue, result + dice);
        }
    }

    public static void main(String[] args) {
        boardDice(0, 10, "");
    }

}
