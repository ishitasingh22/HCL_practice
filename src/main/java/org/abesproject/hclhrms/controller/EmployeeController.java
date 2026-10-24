package org.abesproject.hclhrms.controller;

import org.abesproject.hclhrms.EmployeeServiceImp;
import org.abesproject.hclhrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImp employeeServiceImp;
    @GetMapping("/")
    public String welcomeMsg(){
        return "Welcome to ABES HRMS";
    }
    @GetMapping("/addemp")
    public String addnewEmployee(){
        return employeeServiceImp.addEmp();
    }
    @GetMapping("/getemp")
    public List<Employee> getEmp() {
        return employeeServiceImp.getEmp();
    }
    @GetMapping("/getempbyid")
    public Employee getEmpById() {
        return employeeServiceImp.getEmpById(2000);
    }

    @GetMapping("/addbulk")
    public String addBulk() {

        List<Employee> employees = List.of(
                new Employee(5000, "Mahi", "QA",
                        "mahi@example.com", "C++"),
                new Employee(9000, "Gauri", "FDE",
                        "gauri@example.com", "Python")
        );

        return employeeServiceImp.addBulk(employees);
    }
    @DeleteMapping("/deleteemp")
    public String deleteEmp() {
        return employeeServiceImp.deleteById(2000);
    }
    @PutMapping("/updateemp")
    public String updateEmp() {
        Employee updatedEmp = new Employee(
                2000,
                "Ishita",
                "SDE",
                "newemail@example.com",
                "JAVA"
        );

        return employeeServiceImp.updateById(2000, updatedEmp);
    }


}
