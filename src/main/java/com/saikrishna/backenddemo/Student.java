package com.saikrishna.backenddemo;

public class Student
{
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(){}

    public Student(Student student)
    {
        id = student.id;
        name = student.name;
        age = student.age;
        department = student.department;

    }
    public Student(int id, String name, int age , String department)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId(){ return id; }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }
}
