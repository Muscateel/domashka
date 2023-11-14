package list11;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;
    Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = head; // Связываем хвост с головой, создавая кольцевую структуру
    }

    public void removeNode(int data) {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        Node prev = null;

        do {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Элемент не найден.");
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        System.out.println("Список:");
        list.displayList();

        if (list.head != null) {
            list.removeNode(2);
            System.out.println("После удаления элемента:");
            list.displayList();
        }
    }
}
