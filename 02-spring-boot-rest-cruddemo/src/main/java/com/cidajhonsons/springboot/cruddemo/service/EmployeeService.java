package com.cidajhonsons.springboot.cruddemo.service;
import com.cidajhonsons.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
