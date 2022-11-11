package com.fbaa.hashtable.probing;

import com.fbaa.models.Employee;

public class SimpleHashtable {

    public StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        if (occupied(hashKey)) {
            int stopIndex = hashKey;
            if (hashKey == hashtable.length - 1) {
                hashKey = 0;
            } else {
                hashKey++;
            }
            while (occupied(hashKey) && hashKey != stopIndex) {
                hashKey = (hashKey + 1) % hashtable.length;
            }
        }


        if (occupied(hashKey)) {
            System.out.println("Sorry! There is already one employee at position: " + hashKey);
        } else {
            hashtable[hashKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }
        return hashtable[hashKey].employee;
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);
        if (hashtable[hashKey] != null &&
                hashtable[hashKey].key.equals(key)) {
            return hashKey;
        }

        int stopIndex = hashKey;
        if (hashKey == hashtable.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
        }
        while (hashKey != stopIndex &&
                hashtable[hashKey] != null &&
                !hashtable[hashKey].key.equals(key)) {
            hashKey = (hashKey + 1) % hashtable.length;
        }

        if (hashtable[hashKey]!= null &&
                hashtable[hashKey].key.equals(key)) {
            return hashKey;
        } else {
            return -1;
        }
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }

        Employee employee = hashtable[hashKey].employee;
        hashtable[hashKey] = null;
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for(int i = 0; i< oldHashtable.length; i++){
            if (oldHashtable[i]!= null) {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }
        return employee;

    }
    public int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println("Position: " + i + " : " + hashtable[i].employee);
            }
        }
    }
}
