package com.example.schoolhofwarts.service;


import com.example.schoolhofwarts.model.Faculty;
import com.example.schoolhofwarts.repositories.FacultyRepository;
import org.springframework.stereotype.Service;


@Service
public class FacultyService {


    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty getFaculty(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    public Faculty postFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty putFaculty(Faculty faculty) {
        if (facultyRepository.findAll().contains(faculty)) {
            return facultyRepository.save(faculty);
        }
        return null;
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
}

