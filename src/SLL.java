
public class SLL {
    public Node head;

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeFront() {
        if (head != null) {
            head = head.next;
        }
    }
}

