//package core2;
//import coreJava.P1;
//public class P2 {
//    public static void main(String[] args) {
//        P1 s = new P1();
//        s.showStudent();
//    }
//}
package core2;

import coreJava.P1;

public class P2 {

    public static void main(String[] args) {

        P1 s = new P1();

        s.setName("Ishita");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.showStudent();
    }
}