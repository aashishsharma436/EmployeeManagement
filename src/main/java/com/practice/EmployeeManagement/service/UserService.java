package com.practice.EmployeeManagement.service;

import com.practice.EmployeeManagement.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto)
}
