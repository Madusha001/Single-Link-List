// Node කලාපය class එකක් ලෙස හැඳින්වීම
class Node {
    int data;
    Node next;

    // Node එකක් නිර්මාණය කිරීම සඳහා Constructor එක
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class එක
class LinkedList {
    Node head;

    // Head node එක null ලෙස initialize කිරීම
    LinkedList() {
        this.head = null;
    }

    // Node එකක් list එකට අග add කිරීම
    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Linked List එක print කිරීම
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Linked List object එකක් නිර්මාණය කිරීම
        LinkedList list = new LinkedList();

        // Nodes 3 ක් append කිරීම
        list.append(1);
        list.append(2);
        list.append(3);

        // List එක print කිරීම
        list.printList();
    }
}
