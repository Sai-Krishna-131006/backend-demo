package com.saikrishna.backenddemo.controller;
import com.saikrishna.backenddemo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class HelloController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> getStudent()
    {
        return students;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student)
    {
        students.add(student);
        return student;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        for(Student s: students)
        {
            if(s.getId() == id)
            {
                return s;
            }
        }
        return null;
    }


}