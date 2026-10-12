
package Lambdas;

@FunctionalInterface
interface MyInterface {
    void display();
}

public class Example {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello from Lambda Expression!");

        obj.display();
    }
}
