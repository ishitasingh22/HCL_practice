
package Lambdas;
import java.util.function.Predicate;
//@FunctionalInterface
//interface CheckNumber {
//    void check(int n);
//}

public class Even {
    public static void main(String[] args) {
//
//        CheckNumber obj = (n) -> {
//            if (n % 2 == 0)
//                System.out.println("Even Number");
//            else
//                System.out.println("Odd Number");
//        };
//
//        obj.check(10);
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10) ? "Even Number" : "Odd Number");
        System.out.println(even.test(7) ? "Even Number" : "Odd Number");

    }
}

