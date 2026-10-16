package Abstarcttt;
//normal class hogaa to implement
//abstarct class hoga to extends
//and we can use multiple inheritance using interface
// Interface members are public, static, and final by default
interface Aa {
    static int num = 10;

    static void show() {
        System.out.println("Static method in interface A");
    }
}
//static means class level we can use the method without creating any instance or object
public class Inti {
    public static void main(String[] args) {
        Aa.show();

        System.out.println(Aa.num);
    }
}
