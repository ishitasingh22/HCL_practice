package core2;

import coreJava.Demo1;


//public class Demo2 {
//    public static void main(String[] args){
//        Demo1 a=new Demo1();
//        a.m1();
//    }
//}
// if the parent method is protected we can only use access it by inheriting and making the instance of the child class
//if the parent method is protected
public class Demo2 extends Demo1{
    public static void main(String[] args){
        Demo2 a=new Demo2();
        a.m1();
    }
}

