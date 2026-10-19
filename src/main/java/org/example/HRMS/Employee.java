package org.example.HRMS;

public class Employee {

    private int id;
    private String name;
    private Address address;
    private Salary salary;
    private Department department;

    public Employee(int id, String name, Address address,
                    Salary salary, Department department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(department.getDepartmentName());

        System.out.println(address.getCity());
        System.out.println(address.getState());
        System.out.println(address.getPincode());

        System.out.println(salary.getBasic());
        System.out.println(salary.getDa());
        System.out.println(salary.getHra());

        System.out.println(salary.getConsolidatedSalary());
    }
}
