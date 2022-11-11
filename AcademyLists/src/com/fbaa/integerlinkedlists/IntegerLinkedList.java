package com.fbaa.integerlinkedlists;

public class IntegerLinkedList {
    private IntegerNode head;
    private int size;

    public void insertSorted(Integer value) {

        if (head == null || head.getValue() >= value) {
            addFromFront(value);
            return;
        }

        IntegerNode current = head;
        IntegerNode prev = null;
        while (current != null && current.getValue() < value) {
            prev = current;
            current = current.getNext();
        }

        IntegerNode node = new IntegerNode(value);

        prev.setNext(node);
        node.setNext(current);
        size++;
    }

    public void addFromFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        IntegerNode node = head;
        head = head.getNext();
        size--;
        node.setNext(null);
        return node;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
