package com.fbaa.queues.array.updated;

import com.fbaa.models.Employee;

public class Main {
    public static void main(String[] args) {


        Employee JaneJones = new Employee("Jane", "Jones", 123);
        Employee JohnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee BillEnd = new Employee("Bill", "End", 78);


        ArrayQueue queue = new ArrayQueue(5);
        queue.add(JaneJones);
        queue.add(JohnDoe);
        queue.remove();
        queue.add(MarySmith);
        queue.remove();
        queue.add(MikeWilson);
        queue.remove();
        queue.add(BillEnd);
        queue.remove();
        queue.add(JaneJones);

        queue.printQueue();


    }
}
