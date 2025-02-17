package com.cidajhonsons.springboot.cruddemo.dao;

import com.cidajhonsons.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

    // é isso ... não precisa mais escrever nenhum código kakakakak
}
