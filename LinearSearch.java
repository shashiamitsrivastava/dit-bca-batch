public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4546, 7, 8, 99 };
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                System.out.println("Found at Index " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound)
            System.out.println("Not Found");

    }

}
