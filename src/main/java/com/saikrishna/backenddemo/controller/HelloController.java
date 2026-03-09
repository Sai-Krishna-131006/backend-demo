package com.saikrishna.backenddemo.controller;
import com.saikrishna.backenddemo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        Student s1 = new Student("Sai Krishna",19,"CSE Cyber Securty");
        Student s2 = new Student("Ayush Kumar",20,"IT");
        Student s3 = new Student("Teja Abhinay", 19, "CSE");

        return List.of(s1, s2, s3);
    }
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Sai Krishna",20,"Computer Science Engineering");
        }
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student)
    {
        return student;
    }
    @GetMapping("/wish")
    public String sayHello() {
        return "hello";
    }

}