package com.wipro.topgear.spring.springboot.service;

import com.wipro.topgear.spring.springboot.adapter.EmployeeAdapter;
import com.wipro.topgear.spring.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeAdapter employeeAdapter;

    @Autowired
    public EmployeeService(EmployeeAdapter employeeAdapter) {
        this.employeeAdapter = employeeAdapter;
    }

    public Employee findEmployee(Integer id) {
        return employeeAdapter.findEmployee(id);
    }

    public void createEmployee(Employee employee) {
        employeeAdapter.createEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeAdapter.updateEmployee(employee);
    }

    public void deleteEmployee(Long id) {
        employeeAdapter.deleteEmployee(id);
    }

    public Collection<Employee> employees() {
        return employeeAdapter.employees();
    }

    public List<Employee> getEmployees() {
        return employeeAdapter.getEmployees();
    }

    public Employee findOne(Long id) {
        return employeeAdapter.findOne(id);
    }
}
