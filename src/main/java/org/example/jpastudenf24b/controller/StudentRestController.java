package org.example.jpastudenf24b.controller;


import org.example.jpastudenf24b.model.Student;
import org.example.jpastudenf24b.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentRestController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        return studentRepository.save(student);
    }

    @PutMapping("/studentgak")
    public Student updateStudentgak(@RequestBody Student student) {
        Optional<Student> orgStudent = studentRepository.findById(student.getId());
        if (orgStudent.isPresent()) {
            return studentRepository.save(student);
        } else {
            Student newStudent = new Student();
            newStudent.setName("not found");
            return newStudent;
        }
    }

    @PutMapping("/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Optional<Student> orgStudent = studentRepository.findById(student.getId());
        if (orgStudent.isPresent()) {
            studentRepository.save(student);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Student(),HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable int id) {
        Optional<Student> orgStudent = studentRepository.findById(id);

    }



}
