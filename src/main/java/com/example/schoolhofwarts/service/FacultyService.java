package com.example.schoolhofwarts.service;


import com.example.schoolhofwarts.model.Faculty;
import com.example.schoolhofwarts.repositories.FacultyRepository;
import org.springframework.stereotype.Service;



@Service
public class FacultyService {


    FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty getFaculty (Long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty postFaculty (Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty putFaculty (Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty (Long id) {
        facultyRepository.deleteById(id);
    }
}

