package hw3;

public class LinkedList<T extends Comparable<T>> {
    private Node root;
    public int getSize() {
        return size;
    }
    private int size;
    public void add(T value) {
        Node newNode = new Node(value, null);
        if (root == null) {
            root = newNode;
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public void print() {
        System.out.print(" ");
        Node currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(" null");
    }

    /*home work
    Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
     */
    public void reverseList() {
        if (getSize() == 0)
            return;
        Node reversedPart = null;
        Node current = root;
        while (current != null) {
            Node next = current.next;
            current.next = reversedPart;
            reversedPart = current;
            current = next;
        }
        root = reversedPart;
    }

    private class Node {
        public T value;
        public Node next;

        public Node(T _value, Node _next) {
            this.value = _value;
            this.next = _next;
        }
    }
}