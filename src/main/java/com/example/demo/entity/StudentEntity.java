package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   // @NotBlank(message = "Name should be given")
    private String name;
   // @Email
    private String email;
    private float cgpa;
    
    public StudentEntity() {
    }

    public StudentEntity(String name, String email, float cgpa) {
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }
    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
