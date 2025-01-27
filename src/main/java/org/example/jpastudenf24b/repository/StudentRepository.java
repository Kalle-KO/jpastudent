package org.example.jpastudenf24b.repository;

import org.example.jpastudenf24b.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
