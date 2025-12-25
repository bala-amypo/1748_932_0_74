package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    
    @Query("FROM StudentEntity s WHERE s.cgpa > :cgpa");
    List<SudentEntity> findStudentWithCgpa(@Param("cgpa") float cgpa);
}
