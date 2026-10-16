
package Lambdas;
import java.util.function.BiFunction;
//@FunctionalInterface
//interface Calculate {
//    double calculate(double a, double b);
//}

public class Calculator {
    public static void main(String[] args) {

//        Calculate add = (a, b) -> a + b;
//        Calculate subtract = (a, b) -> a - b;
//        Calculate multiply = (a, b) -> a * b;
//        Calculate divide = (a, b) -> a / b;


//        System.out.println("Addition: " + add.calculate(10, 5));
//        System.out.println("Subtraction: " + subtract.calculate(10, 5));
//        System.out.println("Multiplication: " + multiply.calculate(10, 5));
//        System.out.println("Division: " + divide.calculate(10, 5));
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divide = (a, b) -> a / b;

        System.out.println("Addition: " + add.apply(10.0, 5.0));
        System.out.println("Subtraction: " + subtract.apply(10.0, 5.0));
        System.out.println("Multiplication: " + multiply.apply(10.0, 5.0));
        System.out.println("Division: " + divide.apply(10.0, 5.0));
    }
}
