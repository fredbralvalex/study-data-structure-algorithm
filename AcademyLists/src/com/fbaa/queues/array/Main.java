package com.fbaa.queues.array;

import com.fbaa.models.Employee;
import com.fbaa.stacks.array.ArrayStack;

public class Main {
    public static void main(String[] args) {


        Employee JaneJones = new Employee("Jane", "Jones", 123);
        Employee JohnDoe = new Employee("John", "Doe", 4567);
        Employee MarySmith = new Employee("Mary", "Smith", 22);
        Employee MikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee BillEnd = new Employee("Bill", "End", 78);


        ArrayQueue queue = new ArrayQueue(10);
        queue.add(JaneJones);
        queue.add(JohnDoe);
        queue.add(MarySmith);
        queue.add(MikeWilson);
        queue.add(BillEnd);

        queue.printQueue();

        System.out.println();
        System.out.println("Peek: " + queue.peek());

        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
        System.out.println("Remove: " + queue.remove());
//        System.out.println("Remove: " + queue.remove());

        queue.add(MikeWilson);

        System.out.println();
        queue.printQueue();
        System.out.println();


    }
}
