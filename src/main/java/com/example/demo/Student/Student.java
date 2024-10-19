package com.example.demo.Student;
import lombok.Getter;
import org.springframework.stereotype.Component;
//import lombok.Builder;
import java.time.LocalDate;
@Component
@Getter
public class Student {
    private String name;
    private String email;
    private Long id;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(String name, String email, Long id, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
//creating getter

