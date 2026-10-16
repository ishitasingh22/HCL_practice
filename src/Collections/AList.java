package Collections;

import java.util.*;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

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

        list.remove(Integer.valueOf(60));
        System.out.println(list);

        System.out.println(list.contains(50));
        System.out.println(list.indexOf(80));
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(110);
        list2.add(120);

        list.addAll(list2);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}