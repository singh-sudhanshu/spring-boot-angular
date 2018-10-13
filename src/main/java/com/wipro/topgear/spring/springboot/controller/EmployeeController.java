package com.wipro.topgear.spring.springboot.controller;

import com.wipro.topgear.spring.springboot.model.Employee;
import com.wipro.topgear.spring.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/{id}")
    public Employee employee(@PathVariable("id") Long  id) {
        return employeeService.findOne(id);
    }

    @GetMapping("/employee")
    public Collection<Employee> employees() {
        return employeeService.employees();
    }

    @PostMapping("/employee")
    public void employee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    @PutMapping("/employee")
    public void employees(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void employees(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        System.out.println(employeeService.getEmployees());
        return employeeService.getEmployees();
    }
}
