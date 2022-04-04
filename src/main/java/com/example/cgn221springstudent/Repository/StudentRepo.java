package com.example.cgn221springstudent.Repository;

import com.example.cgn221springstudent.model.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepo {

    Map<String, Student> students = new HashMap();

    public StudentRepo() {
    }

    public Student addStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public Student getById(String id) {
        return students.get(id);
    }

    public List<Collection<Student>> getAllStudents() {
        return List.of(students.values());
    }

    public Student removeStudent(String id) {
        return students.remove(id);
    }

    public Student updateStudent(Student student) {
        return students.put(student.getId(), student);
    }
}
