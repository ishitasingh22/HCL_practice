package Collections;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(100);

        System.out.println(set);

        set.add(20);
        System.out.println(set);

        System.out.println(set.contains(50));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        set.remove(30);
        System.out.println(set);

        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(60);
        set2.add(110);
        set2.add(120);

        HashSet<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);
        System.out.println(intersection);

        HashSet<Integer> difference = new HashSet<>(set);
        difference.removeAll(set2);
        System.out.println(difference);

        set.clear();
        System.out.println(set);
    }
}
