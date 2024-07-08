class Queue {
    int data[];
    int front;
    int rear;
    int size;

    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return rear == data.length;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
        return data[front];
    }

    void enqueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full Element Cannot Be inserted");
        }
        if (size == 0) {
            front++;
        }
        size++;
        data[++rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty Deletion is Not Possible");
        }

        int temp = data[front];
        front++;
        size--;
        if (size == 0) {
            front = rear = -1;
        }

        return temp;
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        // System.out.println(queue);
    }
}
