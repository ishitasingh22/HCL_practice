package org.abesproject.hclhrms;

import org.abesproject.hclhrms.entity.Employee;
import org.abesproject.hclhrms.repository.EmpRepoImp;
import org.abesproject.hclhrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp {
    @Autowired
    private EmpRepoImp emprepo;
    public String addEmp(){
        Employee emp1=new Employee(2000,"Ishitaa","SDE","singhishita481@gmail.com","JAVA");
        return emprepo.addemp(emp1);
    }
    public Employee getEmp() {
        return emprepo.getEmp();
    }
    public Employee getEmpById(long empid) {
        return emprepo.getEmpById(empid);
    }
}
