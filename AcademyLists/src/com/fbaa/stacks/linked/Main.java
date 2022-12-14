package com.fbaa.stacks.linked;

import com.fbaa.models.Employee;
import com.fbaa.stacks.array.ArrayStack;

public class Main {
    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();
        System.out.println();
        System.out.println("Peek: " + stack.peek());
        System.out.println();
        stack.printStack();
        System.out.println();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());


    }
}
