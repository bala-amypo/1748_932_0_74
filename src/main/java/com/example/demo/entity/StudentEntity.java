package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private int age;

    StudentEntity()

}