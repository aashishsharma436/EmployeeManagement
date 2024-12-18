package com.practice.EmployeeManagement.service.Impl;


import com.practice.EmployeeManagement.Repo.EmployeeRepository;
import com.practice.EmployeeManagement.models.Employee;
import com.practice.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
    @Override
    public void saveEmployee(Employee employe){
        this.repository.save(employe);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> optional = Optional.of(repository.getById(id));
        if(optional.isPresent()) return optional.get();
        else throw new RuntimeException("Employee not found for id: "+id);
    }

    @Override
    public void deleteEmployeeById(int id) {
        this.repository.deleteById(id);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo -1,pageSize,sort);
        return this.repository.findAll(pageable);
    }

}
