package com.wipro.topgear.spring.springboot.adapter;

import com.wipro.topgear.spring.springboot.connector.EmployeeConnector;
import com.wipro.topgear.spring.springboot.connector.EmployeeConnectorStubImpl;
import com.wipro.topgear.spring.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class EmployeeAdapter {

    private final EmployeeConnectorStubImpl employeeConnectorStubImpl;
    private final EmployeeConnector employeeConnector;

    @Autowired
    public EmployeeAdapter(
            EmployeeConnectorStubImpl employeeConnectorStubImpl,
            EmployeeConnector employeeConnector
    ) {
        this.employeeConnectorStubImpl = employeeConnectorStubImpl;
        this.employeeConnector = employeeConnector;
    }

    public Employee findEmployee(Integer id) {
        return employeeConnectorStubImpl.findEmployee(id);
    }

    public void createEmployee(Employee employee) {
        employeeConnector.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeConnector.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeConnector.delete(id);
    }

    public Collection<Employee> employees() {
        return employeeConnectorStubImpl.employees();
    }

    public List<Employee> getEmployees() {
       return employeeConnector.findAll();
    }

    public Employee findOne(Long id) {
        return employeeConnector.findOne(id);
    }
}
