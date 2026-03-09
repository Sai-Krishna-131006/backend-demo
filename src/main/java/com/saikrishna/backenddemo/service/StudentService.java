package com.saikrishna.backenddemo.service;
import com.saikrishna.backenddemo.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class StudentService
{
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents()
    {
        return students;
    }

    public Student addStudent(Student student)
    {
        students.add(student);
        return student;
    }

    public Student getStudentById(int id)
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

    public Student updateStudent(int id, Student updatedStudent)
    {
        for(Student s : students)
        {
            if(s.getId() == id)
            {
                s.setName(updatedStudent.getName());
                s.setAge(updatedStudent.getAge());
                s.setDepartment(updatedStudent.getDepartment());
                return s;
            }
        }
        return null;
    }

    public Student deleteStudent(int id)
    {
        for(Student s: students)
        {
            if(s.getId() == id)
            {
                students.remove(s);
                return s;
            }
        }
        return null;
    }
}
