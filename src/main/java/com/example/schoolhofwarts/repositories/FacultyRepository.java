package com.example.schoolhofwarts.repositories;

import com.example.schoolhofwarts.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
