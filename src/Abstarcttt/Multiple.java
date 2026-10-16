package Abstarcttt;
//functional interface===single abstract class
//used to execute lambda functions

interface Aaa{
    void show();
}

interface Baa {
    void display();
}

class C implements Aaa, Baa {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();

        obj.show();
        obj.display();
    }
}
