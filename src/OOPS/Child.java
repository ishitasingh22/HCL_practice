package OOPS;

class Parent {

    void m1() {
        System.out.println("Parent method 1");
    }

    void m2() {
        System.out.println("Parent method 2");
    }
}

class Child extends Parent {

    @Override
    void m1() {
        System.out.println("Child method 1");
    }

    @Override
    void m2() {
        System.out.println("Child method 2");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.m1();
        c.m2();

        c.sm1();
        c.sm2();
    }

    void sm1() {
        super.m1();
    }

    void sm2() {
        super.m2();
    }
}
//we can make instance of parent and child using parent class but we cannot make the object of parent class using child class
//A a=new A();
//A a=new B();
//B b=new B();
//B b=new A();
//A is parent and B is child
//instance counter
//we cannot override a static method
