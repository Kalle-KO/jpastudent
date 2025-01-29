package org.example.jpastudenf24b.controller;

import org.example.jpastudenf24b.model.Student;
import org.example.jpastudenf24b.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRestControllerTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testStud() {
        Student s1 = new Student();
        s1.setName("testxx");
        studentRepository.save(s1);
        //s1.setId(0);
        studentRepository.save(s1);
        assertEquals(2, studentRepository.findAll().size());
    }


}