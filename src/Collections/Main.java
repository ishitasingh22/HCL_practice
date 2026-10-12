package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator<Student> {
    int rollNo;
    String name;
    double marks;

    Student() {
    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.marks, s2.marks);
    }

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul", 85.5));
        list.add(new Student(1, "Aman", 92.0));
        list.add(new Student(2, "Priya", 78.5));

        Collections.sort(list, new Student());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}