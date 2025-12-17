package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;

    public StudentEntity(Long id , String name , String email , int age)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public StudentEntity()
    {
        
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setAge(String age)
    {
        this.age = age;
    }

    public String getName(String name)
    {
        return name;
    }
    public String getEmail(String email)
    {
        return email;
    }
    public int getAge(int age)
    {
        return age;
    }
}