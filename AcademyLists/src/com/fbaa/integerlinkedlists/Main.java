package com.fbaa.integerlinkedlists;

public class Main {
    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

//        System.out.println(list.isEmpty());

        list.insertSorted(4);
        list.insertSorted(2);
        list.insertSorted(1);
        list.insertSorted(5);

//        System.out.println(list.getSize());
        list.printList();

    }
}
