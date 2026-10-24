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
    public String addBulk(List<Employee> bulkEmp) {
        emplist.addAll(bulkEmp);
        return "Bulk employees added successfully";
    }


    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {
        return emplist.stream().filter(e->e.getEmp_id()==empid).findFirst().orElse(null);
    }

    @Override
    public String deleteById(long empid) {
        boolean status=false;
        if(getEmpById(empid)!=null){
            status=emplist.removeIf(e->e.getEmp_id()==empid);
        }
        if(status){
            return "Deleted sucessfully";
        }

       return "ID not available to remove";
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {
        Employee existingEmp = getEmpById(empid);

        if (existingEmp == null) {
            return "Employee ID not found";
        }

        existingEmp.setEmail(updatedEmp.getEmail());

        return "updated successfully";
    }

}
