package com.danya.springboot.dao;

import com.danya.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
