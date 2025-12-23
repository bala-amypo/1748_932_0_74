package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.exception.ResourceNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Transactional
    public StudentEntity addStudent(StudentEntity student) {
        repository.save(student);
        if(student.getName().equals("abcd"))
        {
            throw new ResourceNotFoundException("Error");
        }
        return student;
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
