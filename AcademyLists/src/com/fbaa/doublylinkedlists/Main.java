package com.fbaa.doublylinkedlists;

import com.fbaa.linkedlists.EmployeeLinkedList;
import com.fbaa.models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employeeJaneJones = new Employee("Jane", "Jones", 123);
        Employee employeeJohnDoe = new Employee("John", "Doe", 4567);
        Employee employeeMarySmith = new Employee("Mary", "Smith", 22);
        Employee employeeMichaelWilson = new Employee("Michael", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(employeeJaneJones);
        list.addToFront(employeeJohnDoe);
        list.addToFront(employeeMarySmith);
        list.addToFront(employeeMichaelWilson);

        System.out.println(list.getSize());
        list.printList();

        Employee employeeBillEnd = new Employee("Bill", "End", 78);
        list.addToEnd(employeeBillEnd);
        System.out.println(list.getSize());
        list.printList();

        Employee employeeJamesBond = new Employee("James", "Bond", 007);
        list.addBefore(employeeJamesBond, employeeBillEnd);
        System.out.println(list.getSize());
        list.printList();

        Employee employee = new Employee("Someone", "Else", 111);
        list.addBefore(employee, employeeMichaelWilson);
        System.out.println(list.getSize());
        list.printList();

//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();
//
//        list.removeFromEnd();
//        System.out.println(list.getSize());
//        list.printList();
    }
}
