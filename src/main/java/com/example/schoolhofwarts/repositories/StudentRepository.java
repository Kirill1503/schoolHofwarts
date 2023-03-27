package com.example.schoolhofwarts.repositories;

import com.example.schoolhofwarts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long> {
}
