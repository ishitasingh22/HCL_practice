package Collections;

import java.util.*;
//size means the number of elements that are present in list
//capacity means the size of the array
public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.get(1));

        stack.set(1, 200);
        stack.set(4, 500);

        System.out.println(stack.get(1));
        System.out.println(stack.get(4));
        System.out.println(stack);

        stack.push(110);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.search(50));
        System.out.println(stack.contains(80));
        System.out.println(stack.indexOf(30));
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        java.util.Stack<Integer> stack2 = new java.util.Stack<>();
        stack2.push(120);
        stack2.push(130);

        stack.addAll(stack2);
        System.out.println(stack);

        System.out.println(stack.firstElement());
        System.out.println(stack.lastElement());

        stack.clear();
        System.out.println(stack);
    }
}
