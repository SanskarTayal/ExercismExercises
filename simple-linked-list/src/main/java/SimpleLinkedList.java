import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    int size;
    Node head;

    SimpleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    void push(T value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        T topValue = head.data;
        head = head.next;
        size--;
        return topValue;
    }

    void reverse() {
        Node cur = head;
        Node prev = null;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, size);
        Node temp = head;
        int index = 0;
        while (temp != null) {
            arr[index] = temp.data;
            temp = temp.next;
            index++;
        }
        return arr;
    }

    int size() {
        return size;
    }

    class Node {
        T data = null;
        Node next = null;

        Node(T value) {
            this.data = value;
        }
    }
}
