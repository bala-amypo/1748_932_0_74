package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repository.save(student);
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
}
