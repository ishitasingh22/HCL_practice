//package coreJava;
//public class P1{
//    public void showStudent() {
//        System.out.println("I am a Student");
//    }
//}
package coreJava;

public class P1 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}