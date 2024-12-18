package com.practice.EmployeeManagement.Repo;

import com.practice.EmployeeManagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
