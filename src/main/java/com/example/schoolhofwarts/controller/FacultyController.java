package com.example.schoolhofwarts.controller;

import com.example.schoolhofwarts.model.Faculty;
import com.example.schoolhofwarts.service.FacultyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("faculty")
public class FacultyController {


    FacultyService facultyService;

    @GetMapping("{id}")
    public ResponseEntity<Faculty> getFaculty (@PathVariable Long id) {
        Faculty faculty = facultyService.getFaculty(id);
        if (faculty == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }

    @PostMapping()
    public Faculty postFaculty (@RequestBody Faculty faculty) {
        return facultyService.postFaculty(faculty);
    }

    @PutMapping
    public ResponseEntity<Faculty> putFaculty(Faculty faculty) {
        Faculty foundFaculty = facultyService.putFaculty(faculty);
        if (foundFaculty == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundFaculty);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteFaculty(@PathVariable Long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }
}
