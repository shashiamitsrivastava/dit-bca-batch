public class ArrayCrud {
    int arr[];
    int size;

    ArrayCrud(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    void remove(int value) {
        
    }

    int getElement(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid Index");
        }

    }

    void insert(int pos, int value) {
        if (arr.length == size) {
            System.out.println("No Space Left To Insert");
            return;
        }
        int index = pos - 1;
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = value;
        size++;
        System.out.println("Insertion Done");

    }

    public static void main(String[] args) {
        ArrayCrud arrayCrud = new ArrayCrud(5);
        arrayCrud.insert(1, 12);
        System.out.println(arrayCrud.getElement(0));
    }
}