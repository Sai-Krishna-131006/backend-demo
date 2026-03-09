package com.saikrishna.backenddemo.controller;
import com.saikrishna.backenddemo.Student;
import org.springframework.web.bind.annotation.*;
import com.saikrishna.backenddemo.service.StudentService;

import java.util.List;

@RestController
public class HelloController {

    private final StudentService studentService;

    public HelloController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudent()
    {
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentService.getStudentById(id);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/students/{id}")
    public Student deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }


}