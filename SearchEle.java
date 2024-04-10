public class SearchEle {
    static boolean search(int[] arr, int index, int ele) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == ele) {
            return true;
        }
        return search(arr, index + 1, ele);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(search(arr, 0, 80) ? "Found" : "Not Found");
    }

}
