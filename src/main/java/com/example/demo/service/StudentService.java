package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

    StudentEntity addStudent(StudentEntity student);

    List<StudentEntity> getAllStudents();

    StudentEntity getStudentById(Long id);

    void deleteStudentById(Long id);

    List<StudentEntity> getAllStudentsWithCgpa(float cgpa);
}
