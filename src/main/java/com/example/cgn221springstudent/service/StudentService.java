package com.example.cgn221springstudent.service;

import com.example.cgn221springstudent.Repository.StudentRepo;
import com.example.cgn221springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    StudentRepo repo = new StudentRepo();

    public Student getStudentById(String id) {
        return repo.getById(id);
    }

    public Student addStudent(Student student) {
        return repo.addStudent(student);
    }

    public List<Collection<Student>> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student deleteStudent(String id) {
        return repo.removeStudent(id);
    }

    public Student updateStudent(Student student) {
        return repo.updateStudent(student);
    }


}


