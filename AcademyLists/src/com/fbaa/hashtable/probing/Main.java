package com.fbaa.hashtable.probing;

import com.fbaa.models.Employee;

public class Main {

    public static void main(String[] args) {


        Employee JaneJones = new Employee("Jane", "Jones", 123);
        Employee JohnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee BillEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();

        ht.put("Jones", JaneJones);
        ht.put("Doe", JohnDoe);
        ht.put("Wilson", MikeWilson);
        ht.put("Smith", MarySmith);

        ht.printHashtable();

        System.out.println("Retrieve Key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve Key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();

        System.out.println("Retrieve Key Smith: " + ht.get("Smith"));

    }
}
