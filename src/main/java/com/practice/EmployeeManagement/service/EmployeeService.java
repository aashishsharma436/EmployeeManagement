package com.practice.EmployeeManagement.service;

import com.practice.EmployeeManagement.models.Employee;
import org.springframework.data.domain.Page;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployeeById(int id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
