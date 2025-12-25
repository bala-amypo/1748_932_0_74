package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/all")
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
        
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        StudentEntity student = service.getStudentById(id);
        if (student != null) {
            service.deleteStudentById(id);
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }

    @GetMapping("/{cgpa}")
    public List<StudentEntity> getAllStudentsWithCgpa(@PathVariable float cgpa)
    {
        return service.getAllStudentsWithCgpa(cgpa);
    }

}
