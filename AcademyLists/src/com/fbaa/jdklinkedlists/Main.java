package com.fbaa.jdklinkedlists;

import com.fbaa.doublylinkedlists.EmployeeDoublyLinkedList;
import com.fbaa.linkedlists.EmployeeLinkedList;
import com.fbaa.models.Employee;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Employee employeeJaneJones = new Employee("Jane", "Jones", 123);
        Employee employeeJohnDoe = new Employee("John", "Doe", 4567);
        Employee employeeMarySmith = new Employee("Mary", "Smith", 22);
        Employee employeeMichaelWilson = new Employee("Michael", "Wilson", 3245);

        Employee employeeBillEnd = new Employee("Bill", "End", 78);


        LinkedList<Employee> list = new LinkedList<>();

        System.out.println(list.isEmpty());

        list.addFirst(employeeJaneJones);
        list.addFirst(employeeJohnDoe);
        list.addFirst(employeeMarySmith);
        list.addFirst(employeeMichaelWilson);

        System.out.println(list.size());
        System.out.println("HEAD -> ");
        list.forEach(i -> System.out.print(i + " <=> "));
        System.out.println("null");

        list.addLast(employeeBillEnd);
        System.out.println(list.size());
        System.out.println("HEAD -> ");
        list.forEach(i -> System.out.print(i + " <=> "));
        System.out.println("null");


        list.removeFirst();
        System.out.println(list.size());
        System.out.println("HEAD -> ");
        list.forEach(i -> System.out.print(i + " <=> "));
        System.out.println("null");

        list.removeLast();
        System.out.println(list.size());
        System.out.println("HEAD -> ");
        list.forEach(i -> System.out.print(i + " <=> "));
        System.out.println("null");
    }
}
