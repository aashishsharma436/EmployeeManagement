package com.practice.EmployeeManagement.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
