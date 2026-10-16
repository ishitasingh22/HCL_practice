package Collections;

import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        list.set(1, 200);
        list.set(4, 500);

        System.out.println(list.get(1));
        System.out.println(list.get(4));
        System.out.println(list);

        list.add(2, 25);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.contains(50));
        System.out.println(list.indexOf(80));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        java.util.LinkedList<Integer> list2 = new java.util.LinkedList<>();
        list2.add(110);
        list2.add(120);

        list.addAll(list2);
        System.out.println(list);

        list.addFirst(5);
        list.addLast(130);
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        int target = 50;
        int element = 55;

        int index = list.indexOf(target);

        if (index != -1) {
            list.add(index + 1, element);
        }

        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}