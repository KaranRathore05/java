public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void delete1() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deletel() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) { 
            head = null;
            return;
        }
        Node secoundnode = head;
        Node lastnode = head.next;
        while (lastnode.next != null) { 
            secoundnode = secoundnode.next;
            lastnode = lastnode.next;
        }
        secoundnode.next = null; 
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {

            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;

        }
        head.next = null;
        head = prev;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("here");
        list.addfirst("is");
        list.addfirst("linked");
        list.addfirst("list");
        list.printList();
        list.delete1();
        list.printList();
        list.deletel();
        list.printList();       
        list.reverse();
        list.printList();
    }
}
