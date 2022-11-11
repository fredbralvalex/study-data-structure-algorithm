package com.fbaa.stacks;

import com.fbaa.stacks.linked.LinkedStack;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean isPalindrome(String string) {
        LinkedList<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int len = string.length();
        int index = 0;
        Pattern pattern = Pattern.compile("[a-z0-9]", Pattern.CASE_INSENSITIVE);
        while (index < len) {
            Character c = string.charAt(index);
            if (pattern.matcher(c.toString()).find()) {
                stack.push(c.toString());
                sb.append(c);
            }
            index++;
        }

        return stack.stream().collect(Collectors.joining()).equalsIgnoreCase(sb.toString());
    }

    public static void main(String[] args) {
//
//        Pattern pattern = Pattern.compile("[a-z0-9]", Pattern.CASE_INSENSITIVE);
//        System.out.println(pattern.matcher("B").find());


        System.out.println("'abccba' ? Is palindrome? " + isPalindrome("abccba"));
        System.out.println("'Was it a car or a cat I saw?' ? Is palindrome? " + isPalindrome("Was it a car or a cat I saw?"));
        System.out.println("'I did, did I?' ? Is palindrome? " + isPalindrome("I did, did I?"));
        System.out.println("'Racecar' ? Is palindrome? " + isPalindrome("Racecar"));
        System.out.println("'hello' ? Is palindrome? " + isPalindrome("hello"));
        System.out.println("'Don't nod' ? Is palindrome? " + isPalindrome("Don't nod"));
    }

}
