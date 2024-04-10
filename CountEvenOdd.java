public class CountEvenOdd {
    static void evenOddCount(int num, int even, int odd) {
        if (num == 0) {
            System.out.println("Even Count " + even + "Odd COunt " + odd);
            return;
        }
        if (num % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        evenOddCount(num - 1, even, odd);
    }

    static int[] evenOddCount(int number) {
        if (number == 0) {
            int[] arr = new int[2];
            return arr;
        }
        int[] arr = evenOddCount(number - 1);
        if (number % 2 == 0) {
            arr[0] = arr[0] + 1;
        } else {
            arr[1] = arr[1] + 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        // evenOddCount(10, 0, 0);
        int arr[] = evenOddCount(10);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
