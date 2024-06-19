public class TwoDArray {

    static void transpose(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = row; col < arr.length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;

            }
        }
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        transpose(arr);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }

        System.out.println("The  maximum Element is " + findMax(arr));

    }

}
