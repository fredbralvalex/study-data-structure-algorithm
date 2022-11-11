package com.fbaa.hashtable.jdk;

import com.fbaa.hashtable.chaining.ChainedHashtable;
import com.fbaa.models.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Employee JaneJones = new Employee("Jane", "Jones", 123);
        Employee JohnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee BillEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("Jones", JaneJones);
        hashMap.put("Doe", JohnDoe);
//        hashMap.put("Wilson", MikeWilson);
        hashMap.put("Smith", MarySmith);
//        Employee employee = hashMap.put("Doe", MikeWilson);
        Employee employee = hashMap.putIfAbsent("Doe", MikeWilson);
        System.out.println(employee);

        System.out.println(hashMap.get("Smith"));
//        System.out.println(hashMap.get("Someone"));
        System.out.println(hashMap.getOrDefault("Someone", MikeWilson));

        hashMap.remove("Jones");

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(JaneJones));

        Iterator<Employee> iterator = hashMap.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        hashMap.forEach((k,v)-> System.out.println("key: " + k + ", Employee: " + v));

//        System.out.println("Retrieve Key Wilson: " + ht.get("Wilson"));
//        System.out.println("Retrieve Key Smith: " + ht.get("Smith"));
//
//        ht.remove("Doe");
//        ht.remove("Jones");
//        ht.printHashtable();
//
//        System.out.println("Retrieve Key Smith: " + ht.get("Smith"));

    }
}
