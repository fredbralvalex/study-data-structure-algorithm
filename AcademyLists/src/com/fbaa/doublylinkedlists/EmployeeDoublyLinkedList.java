package com.fbaa.doublylinkedlists;

import com.fbaa.models.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public boolean addBefore(Employee employee, Employee existingEmployee) {
        if (head == null) {
            return false;
        }

        EmployeeNode node = new EmployeeNode(employee);
        EmployeeNode existing = new EmployeeNode(existingEmployee);
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existing.getEmployee())) {
            current = current.getNext();
        }
        if (current == null) {
            return false;
        }

        EmployeeNode prev = current.getPrevious();
        node.setPrevious(prev);
        node.setNext(current);
        current.setPrevious(node);

        if (head == current) {
            head = node;
        } else {
            prev.setNext(node);
        }

        size++;
        return true;

    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode node = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        node.setNext(null);
        return node;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode node = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        node.setPrevious(null);
        return null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
