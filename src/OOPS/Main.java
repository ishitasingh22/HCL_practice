package OOPS;

class An {
    void showA() {
        System.out.println("This is Parent class A");
    }
}

class B extends An {
    static void showB() {
        System.out.println("This is Child class B");
    }
}

public class Main {
    public static void main(String[] args) {

        An a1 = new An();
        a1.showA();

        An a2 = new B();
        a2.showA();

        B b1 = new B();
        b1.showA();
        b1.showB();

//         B b2 = new An();
    }
}