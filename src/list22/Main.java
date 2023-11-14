package list22;

class Node {
    String data;
    Node previous;
    Node next;

    public Node(String data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

    }
    private void swap(Node node1, Node node2) {
        String temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
    public void sortList() {
        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.compareTo(current.next.data) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    public void removeNode(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    tail = current.previous;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Элемент не найден.");
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        String data;
        list.addNode("Элемент 1");
        list.addNode("Элемент 3");
        list.addNode("Элемент 2");
        System.out.println("Список до сортировки:");
        list.displayList();

        list.sortList();

        System.out.println("Список после сортировки:");
        list.displayList();
    }

}
