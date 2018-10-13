package com.wipro.topgear.spring.springboot.connector;

import com.wipro.topgear.spring.springboot.model.Employee;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashMap;

@Component
public class EmployeeConnectorStubImpl {

    HashMap<Long, Employee> employees = new HashMap<>();

    public Employee findEmployee(Integer id) {

        if(CollectionUtils.isEmpty(employees))
            throw new RuntimeException("No employee found");
        else
            return employees.get(id);
    }

    public void createEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        System.out.println("Employee created successfully");
    }

    public void updateEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
        System.out.println("Employee updated successfully");
    }

    public void deleteEmployee(Long id) {
        employees.remove(id);
        System.out.println("Employee deleted successfully");
    }

    public Collection<Employee> employees() {
        return employees.values();
    }
}
