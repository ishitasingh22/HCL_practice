package org.example.fielddi;


import org.example.setterdi.AppConfig;
import org.example.setterdi.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        org.example.setterdi.Employee emp = ctx.getBean(Employee.class);
        emp.displayAddress();
        ctx.close();
    }
}
