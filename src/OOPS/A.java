package OOPS;
//using private constructor we can make a singleton class for which onnly one instance can be created
//super
//either we write super or this
//In Java, this and super are keywords used mainly with inheritance and constructors.

//class Student {
//    String name = "Student";
//}
//
//class Faculty extends Student {
//    String name = "Faculty";
//
//    void display() {
//        System.out.println(name);
//        System.out.println(super.name);
//    }
//}
//super.name will give the output Student as it fetches from the parent class

public class A {

    String name;
    int age;

    A() {
    }

    A(String name) {
        this.name = name;
    }

    A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A("Ishita");
        A a3 = new A("Ishita", 22);

        a1.display();
        a2.display();
        a3.display();
    }
}
//interface 100% abstract class
//
