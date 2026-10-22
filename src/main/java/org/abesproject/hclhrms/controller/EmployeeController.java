package org.abesproject.hclhrms.controller;

import org.abesproject.hclhrms.EmployeeServiceImp;
import org.abesproject.hclhrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Employee getEmpById(@RequestParam long empid) {
        return employeeServiceImp.getEmpById(empid);
    }
}
