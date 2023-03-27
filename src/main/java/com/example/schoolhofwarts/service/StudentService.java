package com.example.schoolhofwarts.service;

import com.example.schoolhofwarts.model.Student;
import com.example.schoolhofwarts.repositories.StudentRepository;
import org.springframework.stereotype.Service;




@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student postStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student putStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
