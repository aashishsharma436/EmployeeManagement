package com.practice.EmployeeManagement.Repo;

import com.practice.EmployeeManagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
