
public class Queue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class myQueue {
        static Node head;
        static Node tail;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
            return;

        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;

            }

            return head.data;

        }

    }

    public static void main(String[] args) {
        myQueue q = new myQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
