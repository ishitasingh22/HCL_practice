package Streams;
sealed class A permits B, C {}

final class B extends A {}

final class C extends A {}

public class Seal {
    public static void main(String[] args) {
        A obj = new B();
        System.out.println("Class B");
    }
}
