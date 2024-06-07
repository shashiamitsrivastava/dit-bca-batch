import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 2, 3, 2, 4, 5, 4, 3, 2, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map.get(2));

    }

}
