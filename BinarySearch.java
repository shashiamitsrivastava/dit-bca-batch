public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 13, 56 };
        int search = 34;
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low < high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                System.out.println("Element Found At index " + mid);
                return;
            }
            if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");

    }

}
