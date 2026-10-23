package org.abesproject.hclhrms.controller;

import org.abesproject.hclhrms.EmployeeServiceImp;
import org.abesproject.hclhrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Employee getEmp(){
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



}
