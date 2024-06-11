public class PreComputational {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        int prefixSum[] = new int[arr.length];
        int suffixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        suffixSum[suffixSum.length - 1] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i : prefixSum) {
            System.out.print(i + " ");
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        System.out.println();

        for (int i : suffixSum) {
            System.out.print(i + " ");
        }

    }

}
