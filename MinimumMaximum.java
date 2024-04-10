public class MinimumMaximum {

    static int[] minMax(int[] arr, int index) {
        if (index == arr.length) {
            int[] newArr = new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
            return newArr;
        }
        int newArr[] = minMax(arr, index + 1);
        if (arr[index] < newArr[0]) {
            newArr[0] = arr[index];
        }
        if (arr[index] > newArr[1]) {
            newArr[1] = arr[index];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int newArr[] = minMax(arr, 0);
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }

}
