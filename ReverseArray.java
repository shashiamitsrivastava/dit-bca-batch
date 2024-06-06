public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArrayByk(int arr[]) {

    }

    public static int largest(int[] nums){
        
    }

    public static int secondLargest(int[] arr) {

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
