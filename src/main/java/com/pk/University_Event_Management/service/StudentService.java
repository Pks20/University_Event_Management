package com.pk.University_Event_Management.service;

import com.pk.University_Event_Management.model.Student;
import com.pk.University_Event_Management.repository.IStudentRepo;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public String addStudent(Student s) {
        studentRepo.save(s);
        return "added";
    }
}
