
package Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class Mainn {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(10, 25, 30, 15, 40, 5)
        );
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Ishita", "Rahul", "Aman", "Priya", "Ankit")
        );
        //startswith
        names.stream()
                .filter(name -> name.startsWith("R"))
                .forEach(name -> System.out.println(name));
        //even
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
        //endswith
        names.stream()
                .filter(name -> name.endsWith("a"))
                .forEach(System.out::println);
        //length greater than 4
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);
        //no of even numbers in the list
        int evenCount = Math.toIntExact(nums.stream()
                .filter(n -> n % 2 == 0)
                .count());

        System.out.println(evenCount);
        //number of names
        System.out.println(names.stream().count());
        names.stream()
                .map(name -> "Student " + name)
                .forEach(System.out::println);
        String result = names.stream()
                .reduce("", (a, b) -> a + b + " ");
        System.out.println(result);
    }
}

