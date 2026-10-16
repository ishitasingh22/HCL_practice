package Abstarcttt;

abstract class A {
    abstract void show();
    abstract int m2();

}
abstract class B extends A {
    void show() {
        System.out.println("Hello");
    }
}
public class Example {
    public static void main(String[] args) {
        A a = new B() {
            @Override
            int m2() {
                return 0;
            }
        };

        a.show();

    }
}
//interface==100% abstract class


