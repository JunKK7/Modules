package com.kj.md.business.student.controller;

import com.kj.md.base.domain.student.Student;
import com.kj.md.business.student.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController
{
    private final StudentService studentService;
    @GetMapping("/student")
    public HttpEntity<List<Student>> get()
    {
        List<Student> studentList = studentService.findStudentList();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/student")
    public HttpEntity<Student> post()
    {
        Student save = studentService.save();
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

}
