package com.fbaa.hashtable.probing;

import com.fbaa.models.Employee;

public class StoredEmployee {

    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
