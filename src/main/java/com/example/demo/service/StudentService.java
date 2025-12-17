package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService {

    public StudentEntity addStudents(StudentEntity student);
    public List<StudentEntity> getStudent();

}