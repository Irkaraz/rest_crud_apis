package com.cidajhonsons.springboot.cruddemo.rest;

import com.cidajhonsons.springboot.cruddemo.dao.EmployeeDAO;
import com.cidajhonsons.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty: inject employee dao (I will refactor later) - use constructor injection
    public EmployeeRestController(EmployeeDAO theEmployeeDao){
        employeeDAO = theEmployeeDao;
    }


    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
