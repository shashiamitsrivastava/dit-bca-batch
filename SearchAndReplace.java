public class SearchAndReplace {

    static void replaceElement(int[] arr, int ele, int replace, int index, int count) {
        if (index == arr.length) {
            if(count == 0){
                System.out.println("Element Not Founds");
            }
            return;
        }
        if (arr[index] == ele) {
            arr[index] = replace;
            count++;
        }
        replaceElement(arr, ele, replace, index + 1, count);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 20, 30, 40, 10, 10 };
        int replace = 50;
        int element = 70;
        replaceElement(arr, element, replace, 0, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
