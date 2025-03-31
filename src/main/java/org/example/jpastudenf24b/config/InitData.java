package org.example.jpastudenf24b.config;

import org.example.jpastudenf24b.model.Student;
import org.example.jpastudenf24b.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Bruce env var");
        s1.setBornDate(LocalDate.of(2010,11,12));
        s1.setBornTime(LocalTime.of(10,11,12));
        studentRepository.save(s1);


    }
}
