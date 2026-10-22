package org.abesproject.hclhrms.repository;

import org.abesproject.hclhrms.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo {
    String addemp(Employee emp);
    Employee getEmp();
    Employee getEmpById(long empid);
    String deleteById(long empid);
    String updateById(long emo,Employee updatedEmp);


}
