package com.fbaa.linkedlists;

import com.fbaa.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Employee employeeJaneJones = new Employee("Jane", "Jones", 123);
        Employee employeeJohnDoe = new Employee("John", "Doe", 4567);
        Employee employeeMarySmith = new Employee("Mary", "Smith", 22);
        Employee employeeMichaelWilson = new Employee("Michael", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(employeeJaneJones);
        list.addToFront(employeeJohnDoe);
        list.addToFront(employeeMarySmith);
        list.addToFront(employeeMichaelWilson);

        System.out.println(list.getSize());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
