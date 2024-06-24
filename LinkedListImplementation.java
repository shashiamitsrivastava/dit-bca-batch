class ListNode<T> {
    T val;
    ListNode<T> next;

    ListNode(T val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList<T> {
    private ListNode<T> head = null;

    void insertionAtFront(T val) {
        ListNode<T> newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    void insertionAtEnd(int val) {
        ListNode<T> newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

    }

    void insertionAtAnywhere(int val, int pos) {
        ListNode<T> newNode = new ListNode(val);
        ListNode<T> prev = null;
        ListNode<T> current = head;

        while (current != null && pos > 1) {
            prev = current;
            current = current.next;
            pos--;
        }

        if (pos == 1) {
            prev.next = newNode;
            newNode.next = current;
        }
    }

    void deletionAtbeg() {
        if (head == null) {
            System.out.println("Deletion is Not Possible ");
            return;
        }

        head = head.next;
    }

    void deletionAtLast() {
        if (head == null) {
            System.out.println("Deletion is Not Possible ");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        ListNode<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void deletionAtAnyWhere(int pos) {
        ListNode<T> prev = null;
        ListNode<T> current = head;

        if (head == null) {
            System.out.println("Deletion is Not Possible ");
            return;
        }
        if (head.next == null && pos == 1) {
            head = null;
            return;
        }
        while (current != null && pos > 1) {
            prev = current;
            current = current.next;
            pos--;
        }

        if (pos == 1) {
            prev.next = current.next;
        }
    }

    void print() {
        ListNode<T> current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.insertionAtFront(1);
        list.insertionAtFront(2);
        list.insertionAtEnd(3);
        list.insertionAtEnd(4);
        list.insertionAtEnd(5);
        list.insertionAtAnywhere(6, 3);
        list.deletionAtbeg();
        list.deletionAtLast();
        list.insertionAtFront(89);
        list.deletionAtLast();
        list.deletionAtAnyWhere(2);
        list.print();

    }

}
