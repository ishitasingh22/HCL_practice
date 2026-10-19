
package Spring;

class SingleObject {
    private static SingleObject obj = new SingleObject();
    private SingleObject() {

    }
    public static SingleObject singleObjectCreateInstance() {
        return obj;
    }

    public void display() {
        System.out.println("Hello from Singleton");
    }
}

public class Main {
    public static void main(String[] args) {

        SingleObject obj = SingleObject.singleObjectCreateInstance();
        SingleObject obj1 = SingleObject.singleObjectCreateInstance();
        SingleObject obj2 = SingleObject.singleObjectCreateInstance();
        SingleObject obj3 = SingleObject.singleObjectCreateInstance();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj3));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        obj.display();
    }
}

