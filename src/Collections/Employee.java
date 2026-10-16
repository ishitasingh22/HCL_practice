package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

class Emp {
    int emp_id;
    String name;
    double salary;

    Emp(int emp_id, String name, double salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + emp_id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Employee {
    public static void main(String[] args) {

        ArrayList<Emp> employees = new ArrayList<>();

        employees.add(new Emp(103, "Aman", 40000));
        employees.add(new Emp(101, "Riya", 50000));
        employees.add(new Emp(105, "Karan", 35000));
        employees.add(new Emp(102, "Priya", 60000));
        employees.add(new Emp(104, "Rahul", 45000));
        Iterator<Emp> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //updating data
        for (Emp e : employees) {
            if (e.emp_id == 103) {
                e.name = "Aman Sharma";
                e.salary = 55000;
                break;
            }
        }

        for (Emp e : employees) {
            System.out.println(e);
        }

        Iterator<Emp> i = employees.iterator();

        //deleting data
        while (i.hasNext()) {
            Emp e = i.next();

            if (e.emp_id == 105) {
                i.remove();
            }
        }

        for (Emp e : employees) {
            System.out.println(e);
        }

        Iterator<Emp> itr = employees.iterator();

        while (itr.hasNext()) {
            System.out.println(it.next());
        }

        //forward traversal
        ListIterator<Emp> listIterator = employees.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //backward traversal
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        //ascending order
        Collections.sort(employees, Comparator.comparingInt(e -> e.emp_id));
        for (Emp e : employees) {
            System.out.println(e);
        }

        Collections.sort(
                employees,
                Comparator.comparingInt((Emp e) -> e.emp_id).reversed()
        );
        //descending order

        for (Emp e : employees) {
            System.out.println(e);
        }


        ListIterator<Emp> reverseIterator =
                employees.listIterator(employees.size());

        while (reverseIterator.hasPrevious()) {
            System.out.println(reverseIterator.previous());
        }
    }
}
