package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpRepoImp implements EmployeeRepo{
    List<Employee> emplist=new ArrayList<>();
    @Override
    public String addemp(Employee emp) {
        emplist.add(emp);
        return "Employee added successfully";
    }

    @Override
    public Employee getEmp() {
        if (emplist.isEmpty()) {
            return null;
        }
        return emplist.get(0);
    }

    @Override
    public Employee getEmpById(long empid) {
        return emplist.stream().filter(e->e.getEmp_id()==empid).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empid) {
        return "";
    }

    @Override
    public String updateById(long emo, Employee updatedEmp) {
        return "";
    }

}
