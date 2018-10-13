package com.wipro.topgear.spring.springboot.connector;

import com.wipro.topgear.spring.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeConnector extends JpaRepository<Employee, Long > {


}
