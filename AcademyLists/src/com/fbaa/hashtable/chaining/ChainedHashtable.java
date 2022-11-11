package com.fbaa.hashtable.chaining;

import com.fbaa.models.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    public LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        hashtable[hashKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashKey].listIterator();
        StoredEmployee employee = null;

        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }
        }

        if (employee == null) {
            return null;
        } else {
            hashtable[hashKey].remove(index);
            return employee.employee;
        }
    }

    public int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position: " + i + " : Empty");
            } else {
                System.out.print("Position: " + i + " : ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }
}
