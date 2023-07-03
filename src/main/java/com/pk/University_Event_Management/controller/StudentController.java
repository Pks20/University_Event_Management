package com.pk.University_Event_Management.controller;

import com.pk.University_Event_Management.model.Student;
import com.pk.University_Event_Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("student")
    public Iterable<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("student")
    public String addStudent(@RequestBody Student s){
        return studentService.addStudent(s);}
}
