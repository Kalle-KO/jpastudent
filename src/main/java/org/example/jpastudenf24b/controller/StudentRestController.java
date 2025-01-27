package org.example.jpastudenf24b.controller;


import org.example.jpastudenf24b.model.Student;
import org.example.jpastudenf24b.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }
}
