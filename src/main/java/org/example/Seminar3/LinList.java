package org.example.Seminar3;

public class LinList {
    private Node head;
    private Node tail;

    public void addElements(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void revert() {
        Node currentNode = head;

        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;

            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }
    private class Node {
        private int value;
        private Node next;
        private Node previous;
    }
    public void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        LinList.Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }
}
