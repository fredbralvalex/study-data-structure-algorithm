package com.fbaa.vectors;

import com.fbaa.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>(); //default capacity is 10
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Michael", "Wilson", 3245));
    }
}
