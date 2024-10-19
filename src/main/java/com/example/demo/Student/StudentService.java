package com.example.demo.Student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(
                "Sachin",
                "sachin@gmail.com",
                1L,
                LocalDate.of(2004, 11, 23),
                17));
    }
}
